package com.worchock.recetascomidas.controller;

import com.worchock.recetascomidas.model.TextoCarouselPrincipal;
import com.worchock.recetascomidas.services.implementacion.TextoCarouselPrincipalImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class TextoCarouselPrincipalController {

    @Autowired
    TextoCarouselPrincipalImp textoCarouselPrincipalImp;


    @GetMapping("/textosCarousel")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<TextoCarouselPrincipal> getTextoCarousel(){
        return textoCarouselPrincipalImp.findAll();
    }

    @PostMapping("/textosCarousel")
    @ResponseStatus(HttpStatus.OK)
    public TextoCarouselPrincipal saveTextoCarousel(@RequestBody TextoCarouselPrincipal textoCarouselPrincipal){
        return textoCarouselPrincipalImp.guardarTexto(textoCarouselPrincipal);
    }

    @GetMapping("/eliminarCarousel")
    @ResponseStatus(HttpStatus.OK)
    public String deleteTextoCarousel(@RequestHeader Long id){
        textoCarouselPrincipalImp.deleteById(id);
        return "Eliminado éxitosamente";
    }

    @GetMapping("/encontrarPorLenguaje")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<TextoCarouselPrincipal> findByLenguaje(@RequestHeader Long id){
        return textoCarouselPrincipalImp.findByIdLenguaje(id.toString());
    }
}
