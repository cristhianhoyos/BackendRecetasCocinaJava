package com.worchock.recetascomidas.services.implementacion;

import com.worchock.recetascomidas.dao.IUsuarioDao;
import com.worchock.recetascomidas.model.UsuariosModel;
import com.worchock.recetascomidas.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServiceImp implements IUsuarioService {

    @Autowired
    IUsuarioDao iUsuarioDao;

    @Override
    public List<UsuariosModel> findAll() {
        return (List<UsuariosModel>) iUsuarioDao.findAll();
    }

    @Override
    public Optional<UsuariosModel> findById(Long id) {
        return iUsuarioDao.findById(id);
    }

    @Override
    public Optional<UsuariosModel> findByNombreUsuarioOrCorreoElectronico(String nombreUsuario,String correoElectronico) {
        return iUsuarioDao.findByNombreUsuarioOrCorreoElectronico(nombreUsuario,correoElectronico);
    }

    @Override
    public Optional<UsuariosModel> findByCorreoElectronicoAndContrasena(String correoElectronico, String contrasena) {
        return iUsuarioDao.findByCorreoElectronicoAndContrasena(correoElectronico,contrasena);
    }

    @Override
    public UsuariosModel saveNuevoUsuario(UsuariosModel usuariosModel) {
        return iUsuarioDao.save(usuariosModel);
    }

    @Override
    public Optional<UsuariosModel> findByNombreUsuarioAndContrasena(String nombreUsuario, String contrasena) {
        return iUsuarioDao.findByNombreUsuarioAndContrasena(nombreUsuario,contrasena);
    }

    @Override
    public Optional<UsuariosModel> findByCorreoElectronico(String correoElectrnoico) {
        return iUsuarioDao.findByCorreoElectronico(correoElectrnoico);
    }
}
