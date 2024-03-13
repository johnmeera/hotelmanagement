package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.customerdetailsEntity;

public interface customerdetailsRepo extends JpaRepository<customerdetailsEntity, Long> {
    // You can add custom query methods if needed
}
