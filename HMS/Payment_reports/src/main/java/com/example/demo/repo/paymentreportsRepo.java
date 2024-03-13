package com.example.demo.repo;

import com.example.demo.entity.paymentreportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paymentreportsRepo extends JpaRepository<paymentreportsEntity, Long> {
    // You can add custom queries if needed
}
