package com.worchock.recetascomidas.services;

import com.worchock.recetascomidas.model.LenguajeModel;
import com.worchock.recetascomidas.model.TextoCarouselPrincipal;

import java.util.ArrayList;

public interface ITextoCarouselPrincipalService {

    public ArrayList<TextoCarouselPrincipal> findAll();

    public TextoCarouselPrincipal guardarTexto(TextoCarouselPrincipal textoCarouselPrincipal);

    public void deleteById(Long id);

    public ArrayList<TextoCarouselPrincipal> findByIdLenguaje(String id);
}
