package com.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.Employeev;
import com.Employee.repo.EmployeeRepositoryv;
//import com.Employee.entityv.Employeev;
//import com.Employee.repov.EmployeeRepositoryv;
@Service
public class EmployeeServicevImpl implements EmployeeServicev {
@Autowired
	private EmployeeRepositoryv employeerepov;
//	@Override
//	public String upsert(Employeev employeev) {
//		employeerepov.save(employeev);
//		return saved;
//	}
//	@Override
//	public String upsert1(Employeev employeev) {
//		employeerepov.save(employeev);
//		return "saved";
//	}

	@Override
	public Employeev updateEmployeev(Employeev employeev) {
		if(employeev!=null) {
			return employeerepov.save(employeev);
		}
		return null;
	}
	

	@Override
	public List<Employeev> getAllEmployeevs() {	
		return employeerepov.findAll();
	}
	

	@Override
	public String deleteById(Long customerId) {
		if (employeerepov.existsById(customerId)) {
			employeerepov.deleteById(customerId);
			return "Customer with customerId " + customerId + " deleted successfully.";
		} else {
			return "Customer with customerId " + customerId + " not found.";
		}
	}
	

	@Override
	public Employeev getById(Long customerId) {
		Optional<Employeev> findById = employeerepov.findById(customerId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}


	@Override
	public String upsert(Employeev employeev) {
		employeerepov.save(employeev);
		return "saved";
	}

//	@Override
//	public Employeev createEmployeev(Employeev employeev) {
//		if(employeerepov!=null) {
//			Employeev save = employeerepov.save(employeev);
//			return save;
//		}
//		return null;
//	}

}
