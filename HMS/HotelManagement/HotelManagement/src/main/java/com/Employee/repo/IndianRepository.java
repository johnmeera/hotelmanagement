package com.Employee.repo;



import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Employee.entity.IndianEntity;

@Repository
public interface IndianRepository extends JpaRepository<IndianEntity, Long> {

	
}
