package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.roomsEntity;

public interface roomsRepo extends JpaRepository<roomsEntity, Long> {
    // You can add custom queries if needed
}
