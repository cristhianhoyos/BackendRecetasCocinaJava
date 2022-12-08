package com.worchock.recetascomidas.dao;

import com.worchock.recetascomidas.model.FoodModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IFoodDao extends CrudRepository<FoodModel,Long> {
    public FoodModel findByCategoria(String categoria);
    //public FoodModel findByNombreCategoria(String nombreCategoria);
    public Optional<FoodModel> findByid(Long id);
    //Optional<FoodModel> findByName(String name);
    /*@Query("select food from TABLE_FOOD food where food.id=?1")
    public FoodModel findByIdSQL(Long id);*/
}
