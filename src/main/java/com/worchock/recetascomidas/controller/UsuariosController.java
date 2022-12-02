package com.worchock.recetascomidas.controller;

import com.worchock.recetascomidas.model.ResponseError;
import com.worchock.recetascomidas.model.UsuariosModel;
import com.worchock.recetascomidas.services.IFoodService;
import com.worchock.recetascomidas.services.ILenguajeService;
import com.worchock.recetascomidas.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UsuariosController {

    @Autowired
    private IFoodService foodServiceInterface;

    @Autowired
    private ILenguajeService lenguajeService;

    @Autowired
    private IUsuarioService usuarioService;

    ResponseError responseError = new ResponseError();

    @PostMapping("/guardarUsuario")
    public ResponseEntity<?> createUser(@RequestBody UsuariosModel usuariosModel) throws Exception {
        try {
            if (usuarioService.findByNombreUsuarioOrCorreoElectronico(usuariosModel.getNombreUsuario(),usuariosModel.getCorreoElectronico()).isEmpty()){
                if (usuariosModel.getNombreUsuario().isEmpty())
                {
                    responseError.setMensajeError("El campo nombreUsuario es requerido");
                    return new ResponseEntity<>(responseError,HttpStatus.BAD_REQUEST);
                } else if (usuariosModel.getCorreoElectronico().isEmpty()) {
                    responseError.setMensajeError("El campo correoElectrónico es requerido");
                    return new ResponseEntity<>(responseError,HttpStatus.BAD_REQUEST);
                } else if (usuariosModel.getContrasena().isEmpty()) {
                    responseError.setMensajeError("La contraseña es requerida");
                    return new ResponseEntity<>(responseError,HttpStatus.BAD_REQUEST);
                }else{
                    usuarioService.saveNuevoUsuario(usuariosModel);
                    return new ResponseEntity<>(usuariosModel.getIdUser(),HttpStatus.CREATED);
                }
            }else{
                responseError.setMensajeError("El usuario o correo ya se encuentra registrado");
                return new ResponseEntity<>(responseError,HttpStatus.CONFLICT);
            }

        }catch (Exception e){
            responseError.setMensajeError("Se presenta error al registrar el usuario");
            return new ResponseEntity<>(responseError,HttpStatus.PRECONDITION_FAILED);
        }
    }

    @GetMapping("/encontrarUsuario")
    public ResponseEntity<?> findUser(@RequestHeader Long id) throws Exception{
        try
        {
            Optional<UsuariosModel> usuariosModelDB =usuarioService.findById(id);
            if (usuariosModelDB.isEmpty()){
                responseError.setMensajeError("No se encontró el usuario");
                return new ResponseEntity<>(responseError,HttpStatus.NOT_FOUND);
            }else{
                usuariosModelDB.get().setContrasena(null);
                usuariosModelDB.get().setCorreoElectronico(null);
                return new ResponseEntity<>(usuariosModelDB,HttpStatus.OK);
            }
        }catch (Exception e){
            responseError.setMensajeError("Se presenta error en los servidores");
            System.err.println(e);
            return new ResponseEntity<>(responseError,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/logginUsuario")
    public ResponseEntity<?> logginUsuario(@RequestBody UsuariosModel usuariosModel){
        try{
            Optional<UsuariosModel> usuariosModelDB = usuarioService.findByNombreUsuarioAndContrasena(usuariosModel.getNombreUsuario(),usuariosModel.getContrasena());
            if (usuariosModelDB.isEmpty()){
                Optional<UsuariosModel> usuario = usuarioService.findByCorreoElectronicoAndContrasena(usuariosModel.getCorreoElectronico(),usuariosModel.getContrasena());
                if (usuario.isEmpty()){
                    return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
                }else{
                    return new ResponseEntity<>(usuariosModelDB.get().getIdUser(),HttpStatus.OK);
                }
            }else{
                return new ResponseEntity<>(usuariosModelDB.get().getIdUser(),HttpStatus.OK);
            }

        }catch (Exception e){
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
    }
}
