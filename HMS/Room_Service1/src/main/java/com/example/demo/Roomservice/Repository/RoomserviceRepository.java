package com.example.demo.Roomservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Roomservice.Entity.RoomserviceEntity;

@Repository
public interface RoomserviceRepository extends JpaRepository<RoomserviceEntity, Long> {
    // You can add custom query methods here if needed
}
