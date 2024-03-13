package com.Employee.repo;


import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Employee.entity.ChineaseEntity;

@Repository
public interface ChineaseRepository extends JpaRepository<ChineaseEntity, Long> {

	
}





