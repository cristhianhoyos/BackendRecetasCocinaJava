package com.worchock.recetascomidas.dao;

import com.worchock.recetascomidas.model.LenguajeModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface LenguajeDao extends CrudRepository<LenguajeModel,Long> {

    public Optional<LenguajeModel> findById(Long id);

    public ArrayList<LenguajeModel> findAll();
}
