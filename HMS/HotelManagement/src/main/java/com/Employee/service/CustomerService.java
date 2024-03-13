package com.Employee.service;

import java.sql.Date;
import java.util.List;

import com.Employee.entity.Customer;



public interface CustomerService {
	public String upsert(Customer customer);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer getByDate(Date date);
	public String deleteByDate(Date date);
}
