package com.worchock.recetascomidas.services.implementacion;

import com.worchock.recetascomidas.dao.LenguajeDao;
import com.worchock.recetascomidas.model.LenguajeModel;
import com.worchock.recetascomidas.services.ILenguajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LenguajeServiceImp implements ILenguajeService {

    @Autowired
    LenguajeDao lenguajeDao;

    @Override
    public LenguajeModel findById(Long id) {
        return lenguajeDao.findById(id).orElse(null);
    }

    @Override
    public LenguajeModel saveLenguaje(LenguajeModel lenguajeModel) {
        return (LenguajeModel) lenguajeDao.save(lenguajeModel);
    }

    @Override
    public ArrayList<LenguajeModel> findAll() {
        return lenguajeDao.findAll();
    }

    @Override
    public void deleteAll() {
        lenguajeDao.deleteAll();
    }
}
