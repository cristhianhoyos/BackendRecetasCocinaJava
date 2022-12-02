package com.worchock.recetascomidas.controller;

import com.worchock.recetascomidas.model.FoodModel;
import com.worchock.recetascomidas.model.LenguajeModel;
import com.worchock.recetascomidas.model.ResponseError;
import com.worchock.recetascomidas.services.IFoodService;
import com.worchock.recetascomidas.services.ILenguajeService;
import com.worchock.recetascomidas.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ComidasController {

    @Autowired
    private IFoodService foodServiceInterface;

    @Autowired
    private ILenguajeService lenguajeService;

    @Autowired
    private IUsuarioService usuarioService;

    ResponseError responseError = new ResponseError();

    @GetMapping("/todasLasComidas")
    @ResponseStatus(HttpStatus.OK)
    public FoodModel getFoodModels(){
        return foodServiceInterface.findAll().get(0);
    }



    @PostMapping("/guardarComidas")
    @ResponseStatus(HttpStatus.CREATED)
    public FoodModel createFood(@RequestBody FoodModel foodModel){
        return foodServiceInterface.saveFood(foodModel);
    }


}
