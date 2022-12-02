package com.worchock.recetascomidas.services;

import com.worchock.recetascomidas.model.LenguajeModel;

import java.util.ArrayList;

public interface ILenguajeService {

    public LenguajeModel findById(Long id);

    public LenguajeModel saveLenguaje(LenguajeModel lenguajeModel);

    public ArrayList<LenguajeModel> findAll();
}
