package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.paymentdetailsEntity;

public interface paymentdetailsRepo extends JpaRepository<paymentdetailsEntity, Long> {
    // You can add custom query methods if needed
}
