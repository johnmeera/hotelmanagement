package com.Employee.service;



import java.util.List;

import com.Employee.entity.MoghulaiEntity;

public interface MoghulaiService { // Update the interface name to MoghulaiService
    List<MoghulaiEntity> getAllFoods(); // Update the return type to MoghulaiEntity

    MoghulaiEntity getFoodById(Long id); // 

    MoghulaiEntity addFood(MoghulaiEntity food);

    MoghulaiEntity updateFood(Long id, MoghulaiEntity food); 

    void deleteFood(Long id);
}
