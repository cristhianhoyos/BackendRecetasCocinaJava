package com.worchock.recetascomidas.dao;

import com.worchock.recetascomidas.model.LenguajeModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface LenguajeDao extends CrudRepository<LenguajeModel,Long> {

    public Optional<LenguajeModel> findById(Long id);

    public void deleteAll();

    public ArrayList<LenguajeModel> findAll();
}
