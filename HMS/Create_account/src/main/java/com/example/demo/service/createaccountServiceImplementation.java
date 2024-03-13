package com.example.demo.service;

import com.example.demo.entity.createaccountEntity;
import com.example.demo.repo.createaccountRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class createaccountServiceImplementation implements createaccountService {
	
	@Autowired
    private createaccountRepo createAccountRepository;

    public createaccountServiceImplementation(createaccountRepo accountRepository) {
        this.createAccountRepository = accountRepository;
    }

    @Override
    public createaccountEntity createAccount(createaccountEntity account) {
        // Add any business logic/validation if needed
        return createAccountRepository.save(account);
    }

    @Override
    public createaccountEntity getAccountById(long accountId) {
        return createAccountRepository.findById(accountId).orElse(null);
    }

	
    
}
