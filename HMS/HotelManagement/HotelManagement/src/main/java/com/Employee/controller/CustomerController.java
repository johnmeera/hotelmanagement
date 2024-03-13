//package com.customer.api.controller;
//
//import java.sql.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.customer.api.entity.Customer;
//import com.customer.api.service.CustomerService;
//@RestController
//@Controller
//@CrossOrigin("*")
//@RequestMapping("/customers")
//public class CustomerController {
//	@Autowired
//    CustomerService customerService;
//	@PostMapping("/save")
//    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
//        String status = customerService.upsert(customer);
//        return new ResponseEntity<>(status, HttpStatus.CREATED);
//    }
//	@PutMapping("/customer/update")
//    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
//        Customer updatedCustomer = customerService.updateCustomer(customer);
//        if (updatedCustomer != null) {
//            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//	 @GetMapping("/getAll")
//   public List<Customer> getAllCustomers() {
//       return customerService.getAllCustomers();
//   }
//@GetMapping("/customer/{date}")
//public ResponseEntity<Customer> getByDate(@PathVariable Date date) {
//	Customer customer = customerService.getByDate(date);
//    if (customer != null) {
//        return new ResponseEntity<>(customer, HttpStatus.OK);
//    } else {
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//}
//@DeleteMapping("/delete/{date}")
//public ResponseEntity<String> deleteEmployee(@PathVariable Date date) {
//    String status = customerService.deleteByDate(date);
//    return new ResponseEntity<>(status, HttpStatus.OK);
//}
//}

package com.Employee.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.entity.Customer;
import com.Employee.service.CustomerService;


@RestController
@RequestMapping("/customers")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        String status = customerService.upsert(customer);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(customer);
        if (updatedCustomer != null) {
            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/getByDate/{date}")
    public ResponseEntity<Customer> getByDate(@PathVariable Date date) {
        Customer customer = customerService.getByDate(date);
        if (customer != null) {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{date}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Date date) {
        String status = customerService.deleteByDate(date);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
