package com.Employee.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.ContinentalEntity;
import com.Employee.repo.ContinentalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContinentalServiceImpl implements ContinentalService {

    @Autowired
    private ContinentalRepository continentalRepository;

    @Override
    public List<ContinentalEntity> getAllFoods() {
        return continentalRepository.findAll();
    }

    @Override
    public ContinentalEntity getFoodById(Long id) {
        Optional<ContinentalEntity> optionalFood = continentalRepository.findById(id);
        return optionalFood.orElse(null);
    }

    @Override
    public ContinentalEntity addFood(ContinentalEntity food) {
        return continentalRepository.save(food);
    }

    @Override
    public ContinentalEntity updateFood(Long id, ContinentalEntity food) {
        if (continentalRepository.existsById(id)) {
            food.setCustomerid(id);
            return continentalRepository.save(food);
        }
        return null;
    }

    @Override
    public void deleteFood(Long id) {
        continentalRepository.deleteById(id);
    }

//	@Override
//	public List<ContinentalEntity> getFoodsByCategory(String category) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
