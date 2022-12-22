package com.worchock.recetascomidas.services.implementacion;

import com.worchock.recetascomidas.dao.ITextCarouselDao;
import com.worchock.recetascomidas.model.TextoCarouselPrincipal;
import com.worchock.recetascomidas.services.ITextoCarouselPrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TextoCarouselPrincipalImp implements ITextoCarouselPrincipalService {

    @Autowired
    ITextCarouselDao iTextCarouselDao;


    @Override
    public ArrayList<TextoCarouselPrincipal> findAll() {
        return iTextCarouselDao.findAll();
    }

    @Override
    public TextoCarouselPrincipal guardarTexto(TextoCarouselPrincipal textoCarouselPrincipal) {
        return iTextCarouselDao.save(textoCarouselPrincipal);
    }

    @Override
    public void deleteById(Long id) {
        iTextCarouselDao.deleteById(id);
    }

    @Override
    public ArrayList<TextoCarouselPrincipal> findByIdLenguaje(String id) {
        return iTextCarouselDao.findByIdLenguaje(id);
    }
}
