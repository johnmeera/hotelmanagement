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
import org.springframework.web.bind.annotation.RestController;

import com.Employee.entity.Employeev;
import com.Employee.service.EmployeeServicev;
//import com.Employee.entityv.Employeev;
//import com.Employee.servicev.EmployeeServicev;

@RestController
@Controller
@CrossOrigin("*")
public class EmployeeControllerv {
	@Autowired
	private EmployeeServicev servicev;
	@PostMapping("/save")
	public ResponseEntity<String> createEmployee(@RequestBody Employeev employeev) {
		String status = servicev.upsert(employeev);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
//	@PostMapping("/employee/create")
//	public Employeev createEmployeev(@RequestBody Employeev employeev) {
//		return servicev.createEmployeev(employeev);
//		
//	}
//	@PostMapping("/employeev/create")
//public String upsert(Employeev employeev) {
//	return null;
//	
//}
//	@PutMapping("/employee/update")
//	public Employeev updateEmployeev(Employeev employeev) {
//		return servicev.updateEmployeev(employeev);
//		
//	}
	@PutMapping("/employee/update")
	public ResponseEntity<Employeev> updateEmployeev(@RequestBody Employeev employeev) {
	    Employeev updatedEmployeev = servicev.updateEmployeev(employeev);
	    if (updatedEmployeev != null) {
	        return new ResponseEntity<>(updatedEmployeev, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

	@GetMapping("/employeevs")
	public List<Employeev> getAllEmployeevs(){
		return servicev.getAllEmployeevs();
	}
	
	@DeleteMapping("/employeev/{customerId}")
public ResponseEntity<String> deleteById(@PathVariable Long customerId) {
		String status = servicev.deleteById(customerId);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
//	public String deleteById(@PathVariable Long customerId) {
//		return null;
//		
//	}
//	
	
	@GetMapping("/employeev/{customerId}")
	public ResponseEntity<Employeev> getById(@PathVariable Long customerId){
		Employeev employeev = servicev.getById(customerId);
		if(employeev != null) {
			return new ResponseEntity<>(employeev, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}	
}
