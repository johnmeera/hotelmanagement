package com.Employee.service;


import java.util.List;

import com.Employee.entity.Employeev;

//import com.Employee.entityv.Employeev;

public interface EmployeeServicev {
	
	public String upsert(Employeev employeev);
	
//	public Employeev createEmployeev(Employeev employeev);
	
	public Employeev updateEmployeev(Employeev employeev);
	
	public List<Employeev> getAllEmployeevs();
	
	public String deleteById(Long customerId);
	
	public Employeev getById(Long customerId);
	
}
