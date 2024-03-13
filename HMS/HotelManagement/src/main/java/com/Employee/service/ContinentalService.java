package com.Employee.service;



import java.util.List;

import com.Employee.entity.ContinentalEntity;

public interface ContinentalService {
    List<ContinentalEntity> getAllFoods();

    ContinentalEntity getFoodById(Long id);

    ContinentalEntity addFood(ContinentalEntity food);

    ContinentalEntity updateFood(Long id, ContinentalEntity food);

    void deleteFood(Long id);

//	List<ContinentalEntity> getFoodsByCategory(String category);
}
