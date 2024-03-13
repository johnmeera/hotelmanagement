package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.customerdetailsEntity;
import com.example.demo.service.customerdetailsService;

import java.util.List;

@RestController
@RequestMapping("/api-v1")
@CrossOrigin(origins = "*")
public class customerdetailsController {

    @Autowired
    private customerdetailsService customerDetailsService;

    @GetMapping
    public List<customerdetailsEntity> getAllCustomers() {
        return customerDetailsService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public customerdetailsEntity getCustomerById(@PathVariable long id) {
        return customerDetailsService.getCustomerById(id);
    }

    @PostMapping("/create")
    public customerdetailsEntity saveCustomer(@RequestBody customerdetailsEntity customer) {
        return customerDetailsService.saveCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable long id) {
        customerDetailsService.deleteCustomer(id);
    }
}
