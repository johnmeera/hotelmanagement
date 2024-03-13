package com.Employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.entity.Employeev;

//import com.Employee.entityv.Employeev;
@Repository
public interface EmployeeRepositoryv extends JpaRepository<Employeev, Long>{

}
