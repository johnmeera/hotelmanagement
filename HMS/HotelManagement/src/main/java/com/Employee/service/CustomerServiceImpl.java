package com.Employee.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.entity.Customer;
import com.Employee.repo.CustomerRepo;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private CustomerRepo customerRepository;

    @Override
    public String upsert(Customer customer) {
    	customerRepository.save(customer);
		return "saved";
    }
    @Override
    public Customer updateCustomer(Customer customer) {
    	if(customer!=null) {
        return customerRepository.save(customer);
    }
    	return null;
    }
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
	@Override
	public Customer getByDate(Date date) {
		Optional<Customer> findByDate = customerRepository.findByDate(date);
		if(findByDate.isPresent()) {
			return findByDate.get();
		}
		return null;
	}
	@Override
	public String deleteByDate(Date date) {
		if(customerRepository.existsById(date)) {
			customerRepository.deleteById(date);
			return "Customer with date " + date + "deleted successfully.";
		} else {
		return "Customer with date " + date + " not found." ;
	}
}
}