package com.worchock.recetascomidas.dao;

import com.worchock.recetascomidas.model.Categories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICategoriaDao extends CrudRepository<Categories, Long> {

    public Categories save(Categories categories);

    public List<Categories> findAllById(Long id);

}
