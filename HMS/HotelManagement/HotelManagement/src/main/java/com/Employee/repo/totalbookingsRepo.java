package com.Employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.entity.totalbookingsEntity;
//import com.example.demo.entity.totalbookingsEntity;

public interface totalbookingsRepo extends JpaRepository<totalbookingsEntity, Long> {
    // You can add custom query methods if needed
}
