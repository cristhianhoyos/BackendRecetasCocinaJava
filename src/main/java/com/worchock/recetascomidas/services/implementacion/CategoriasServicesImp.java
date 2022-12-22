package com.worchock.recetascomidas.services.implementacion;

import com.worchock.recetascomidas.dao.ICategoriaDao;
import com.worchock.recetascomidas.model.Categories;
import com.worchock.recetascomidas.services.ICategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CategoriasServicesImp implements ICategoriasService {

    @Autowired
    ICategoriaDao iCategoriaDao;

    @Override
    public List<Categories> findAllById(Long id) {
        return iCategoriaDao.findAllById(id);
    }

    @Override
    public Categories save(Categories categories) {
        return iCategoriaDao.save(categories);
    }
}
