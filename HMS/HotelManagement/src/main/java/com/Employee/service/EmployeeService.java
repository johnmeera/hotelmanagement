package com.Employee.service;

import java.util.List;

import com.Employee.entity.Employee;

public interface EmployeeService {

//	public Employee createEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
//	public Employee deleteById(Integer serviceno);
	public String deleteById(Integer serviceno);
	
	public Employee getById(Integer serviceno);

	public String upsert(Employee employee);

//	public Employee getEmployee(Integer empId);
}
