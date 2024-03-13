package com.Employee.service;



import java.util.List;

import com.Employee.entity.ChineaseEntity;

public interface ChineaseService {
    List<ChineaseEntity> getAllFoods();

    ChineaseEntity getFoodById(Long id);

    ChineaseEntity addFood(ChineaseEntity food);

    ChineaseEntity updateFood(Long id, ChineaseEntity food);

    void deleteFood(Long id);

    //List<IndianEntity> getFoodsByCategory(String category);
}
