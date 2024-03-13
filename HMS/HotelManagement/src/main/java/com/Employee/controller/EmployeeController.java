package com.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.entity.Employee;
import com.Employee.service.EmployeeService;  
@RestController
@Controller
@CrossOrigin("*")
@RequestMapping("/employees")
//@RequestMapping("api-v")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@PostMapping("/save")
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
		String status = service.upsert(employee);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
//@PutMapping("/employee/update")
//	public Employee updateEmployee(@RequestBody Employee employee) {
//		return service.updateEmployee(employee);
//		
//	}
@PutMapping("/update")
public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
    Integer serviceno = employee.getServiceno(); // Assuming serviceno is provided in the request body
    
    if (serviceno != null) {
        Employee existingEmployee = service.getById(serviceno);
        
        if (existingEmployee != null) {
            // Update the employee details
            existingEmployee.setServicename(employee.getServicename());
            existingEmployee.setPrice(employee.getPrice());
            
            // Save the updated employee
            Employee updatedEmployee = service.updateEmployee(existingEmployee);
            
            // Return the updated employee with status 200 OK
            return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
        } else {
            // If the employee with the provided serviceno doesn't exist, return 404 Not Found
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } else {
        // If serviceno is not provided in the request body, return 400 Bad Request
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
//@GetMapping("/employees")
//public List<Employee> getAllEmployees(){
//return 		
//		
//	}

@GetMapping("/employees")
public List<Employee> getAllEmployees() {
	
	return service.getAllEmployees();
}

//	public String deleteById(Integer serviceno) {
//		return null;
//		
//	}
//	public Employee getById(Integer serviceno) {
//		return null;
//		
//	}
	@GetMapping("/employee/{serviceno}")
	public ResponseEntity<Employee> getById(@PathVariable Integer serviceno) {
	    Employee employee = service.getById(serviceno);
	    if (employee != null) {
	        return new ResponseEntity<>(employee, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	@DeleteMapping("/delete/{serviceno}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer serviceno) {
        String status = service.deleteById(serviceno);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
//	@DeleteMapping("/deleteemployee/{empId}")
//	public ResponseEntity<Employee> deleteById(@PathVariable Integer serviceno) {
//		return new ResponseEntity<Employee>(service.deleteById(serviceno), HttpStatus.OK);
//	@DeleteMapping("employee/{serviceno}")
//	public String deleteEmployee(@PathVariable Integer serviceno) {
//	    String deleteEmployee= service.deleteById(serviceno);
//		return deleteEmployee;
//	}
//	}

