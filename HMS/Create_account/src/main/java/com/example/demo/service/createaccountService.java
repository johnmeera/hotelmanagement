package com.example.demo.service;

import com.example.demo.entity.createaccountEntity;

public interface createaccountService {
    createaccountEntity createAccount(createaccountEntity account);
    createaccountEntity getAccountById(long accountId);
    // Add other methods as needed

}
