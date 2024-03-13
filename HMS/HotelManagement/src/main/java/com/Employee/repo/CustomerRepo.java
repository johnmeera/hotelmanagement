package com.Employee.repo;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Date>{

	Optional<Customer> findByDate(Date date);

}
