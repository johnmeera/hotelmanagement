package com.Employee.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.ChineaseEntity;
import com.Employee.repo.ChineaseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ChineaseServiceImpl implements ChineaseService {

    @Autowired
    private ChineaseRepository chineaseRepository;

    @Override
    public List<ChineaseEntity> getAllFoods() {
        return chineaseRepository.findAll();
    }

    @Override
    public ChineaseEntity getFoodById(Long id) {
        Optional<ChineaseEntity> optionalFood = chineaseRepository.findById(id);
        return optionalFood.orElse(null);
    }

    @Override
    public ChineaseEntity addFood(ChineaseEntity food) {
        return chineaseRepository.save(food);
    }

    @Override
    public ChineaseEntity updateFood(Long id, ChineaseEntity food) {
        if (chineaseRepository.existsById(id)) {
            food.setCustomerid(id);
            return chineaseRepository.save(food);
        }
        return null;
    }

    @Override
    public void deleteFood(Long id) {
    	chineaseRepository.deleteById(id);
    }

//	
}
