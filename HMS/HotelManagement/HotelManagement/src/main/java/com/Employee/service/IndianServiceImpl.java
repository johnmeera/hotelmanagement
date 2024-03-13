package com.Employee.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.IndianEntity;
import com.Employee.repo.IndianRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IndianServiceImpl implements IndianService {

    @Autowired
    private IndianRepository indianRepository;

    @Override
    public List<IndianEntity> getAllFoods() {
        return indianRepository.findAll();
    }

    @Override
    public IndianEntity getFoodById(Long id) {
        Optional<IndianEntity> optionalFood = indianRepository.findById(id);
        return optionalFood.orElse(null);
    }

    @Override
    public IndianEntity addFood(IndianEntity food) {
        return indianRepository.save(food);
    }

    @Override
    public IndianEntity updateFood(Long id, IndianEntity food) {
        if (indianRepository.existsById(id)) {
            food.setCustomerid(id);
            return indianRepository.save(food);
        }
        return null;
    }

    @Override
    public void deleteFood(Long id) {
        indianRepository.deleteById(id);
    }



	@Override
	public IndianEntity findByCustomerid(Long customerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndianEntity findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void deleteFood(String breakfast) {
//		// TODO Auto-generated method stub
//		
//	}

//	
}
