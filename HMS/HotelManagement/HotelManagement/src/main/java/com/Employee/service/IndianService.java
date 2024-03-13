package com.Employee.service;



import java.util.List;

import com.Employee.entity.IndianEntity;

public interface IndianService {
    List<IndianEntity> getAllFoods();

    IndianEntity getFoodById(Long id);

    IndianEntity addFood(IndianEntity food);

    IndianEntity updateFood(Long id, IndianEntity food);

    void deleteFood(Long id);

	IndianEntity findByCustomerid(Long customerid);

	IndianEntity findById(Long id);

}
