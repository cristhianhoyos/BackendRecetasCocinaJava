package com.worchock.recetascomidas.controller;

import com.worchock.recetascomidas.model.LenguajeModel;
import com.worchock.recetascomidas.model.ResponseError;
import com.worchock.recetascomidas.services.IFoodService;
import com.worchock.recetascomidas.services.ILenguajeService;
import com.worchock.recetascomidas.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class LenguajesController {

    @Autowired
    private IFoodService foodServiceInterface;

    @Autowired
    private ILenguajeService lenguajeService;

    @Autowired
    private IUsuarioService usuarioService;

    ResponseError responseError = new ResponseError();

    @PostMapping("/saveLenguaje")
    @ResponseStatus(HttpStatus.CREATED)
    public LenguajeModel createLenguaje(@RequestBody LenguajeModel lenguajeModel){
        System.out.println("Se mira createLenguaje");
        System.out.println(lenguajeModel);
        return lenguajeService.saveLenguaje(lenguajeModel);
    }

    @GetMapping("/findLenguaje")
    @ResponseStatus(HttpStatus.OK)
    public LenguajeModel getLenguajeById(@RequestBody LenguajeModel lenguajeModel){
        return lenguajeService.findById(lenguajeModel.getId());
    }

    @GetMapping("/todosLosLenguajes")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<LenguajeModel> getAllLenguajes(){
        return lenguajeService.findAll();
    }

}
