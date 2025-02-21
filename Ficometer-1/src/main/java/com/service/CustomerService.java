package com.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.model.Customer;

@Service
public interface CustomerService {

	public Customer addCustomer(Customer customer);

	public Customer getCustomerById(int id);

	public void deleteCustomerById(int id);

	public List<Customer> getAllCustomer();

	public double checkCreditScore(int uid);

	public Long getTotalCustomers();
	
}
