package com.worchock.recetascomidas.services.implementacion;

import com.worchock.recetascomidas.dao.IFoodDao;
import com.worchock.recetascomidas.model.FoodModel;
import com.worchock.recetascomidas.services.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImp implements IFoodService {

    @Autowired
    private IFoodDao iFoodDao;

    @Override
    @Transactional(readOnly = true)
    public List<FoodModel> findAll() {
        return (List<FoodModel>) iFoodDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public FoodModel findFoodModel(FoodModel foodModel) {
        return (FoodModel) iFoodDao.findByCategoria(foodModel.getCategoria()) ;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<FoodModel> findFoodModelById(Long id) {
        return (Optional<FoodModel>) iFoodDao.findByid(id);
    }

    @Override
    @Transactional(readOnly = true)
    public FoodModel findById(Long id) {
        return iFoodDao.findByid(id).orElse(null);
    }

    @Override
    public FoodModel saveFood(FoodModel foodModel) {
        return (FoodModel) iFoodDao.save(foodModel);
    }
}
