package com.worchock.recetascomidas.services;

import com.worchock.recetascomidas.model.Categories;

import java.util.List;

public interface ICategoriasService {

    public List<Categories> findAllById(Long id);
    public Categories save (Categories categories);
}
