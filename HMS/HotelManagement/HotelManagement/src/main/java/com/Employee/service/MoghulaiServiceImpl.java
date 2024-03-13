package com.Employee.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.MoghulaiEntity;
import com.Employee.repo.MoghulaiRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MoghulaiServiceImpl implements MoghulaiService { // Update the class name to MoghulaiServiceImpl

    @Autowired
    private MoghulaiRepository moghulaiRepository; // Update the repository type to MoghulaiRepository

    @Override
    public List<MoghulaiEntity> getAllFoods() { // Update the return type to MoghulaiEntity
        return moghulaiRepository.findAll();
    }

    @Override
    public MoghulaiEntity getFoodById(Long id) { // Update the return type to MoghulaiEntity
        Optional<MoghulaiEntity> optionalFood = moghulaiRepository.findById(id);
        return optionalFood.orElse(null);
    }

    @Override
    public MoghulaiEntity addFood(MoghulaiEntity food) { // Update the parameter and return type to MoghulaiEntity
        return moghulaiRepository.save(food);
    }

    @Override
    public MoghulaiEntity updateFood(Long id, MoghulaiEntity food) { // Update the parameter and return type to MoghulaiEntity
        if (moghulaiRepository.existsById(id)) {
            food.setCustomerid(id);
            return moghulaiRepository.save(food);
        }
        return null;
    }

    @Override
    public void deleteFood(Long id) {
        moghulaiRepository.deleteById(id);
    }
}