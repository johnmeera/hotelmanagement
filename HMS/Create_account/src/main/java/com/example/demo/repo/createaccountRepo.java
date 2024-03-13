package com.example.demo.repo;

import com.example.demo.entity.createaccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface createaccountRepo extends JpaRepository<createaccountEntity, Long> {
    // You can add custom queries if needed
}
