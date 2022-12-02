package com.worchock.recetascomidas.services;

import com.worchock.recetascomidas.model.FoodModel;

import java.util.List;
import java.util.Optional;

public interface IFoodService {

    public List<FoodModel> findAll();

    public FoodModel findFoodModel(FoodModel foodModel);

    public Optional<FoodModel> findFoodModelById(Long id);

    public FoodModel findById(Long id);

    public FoodModel saveFood(FoodModel foodModel);
}
