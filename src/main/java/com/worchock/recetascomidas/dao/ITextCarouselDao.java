package com.worchock.recetascomidas.dao;

import com.worchock.recetascomidas.model.TextoCarouselPrincipal;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ITextCarouselDao extends CrudRepository<TextoCarouselPrincipal,Long> {

    public ArrayList<TextoCarouselPrincipal> findAll();

    public void deleteById(Long id);

    public ArrayList<TextoCarouselPrincipal> findByIdLenguaje(String id);
}
