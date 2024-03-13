package com.example.demo.controller;

import com.example.demo.entity.createaccountEntity;
import com.example.demo.service.createaccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api-v1")
@CrossOrigin(origins = "http://localhost:3000/")
public class createaccountController {
	@Autowired
    private  createaccountService createAccountService;

    

    @PostMapping("/create")
    public createaccountEntity createAccount(@RequestBody createaccountEntity account) {
        return createAccountService.createAccount(account);
    }

    @GetMapping("/{accountId}")
    public createaccountEntity getAccountById(@PathVariable long accountId) {
        return createAccountService.getAccountById(accountId);
    }
    
}
