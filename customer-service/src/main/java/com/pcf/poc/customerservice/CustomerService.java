package com.pcf.poc.customerservice;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	public Customer getById(Integer id) {
		Customer customer = new Customer();
		customer.setId(id);
		customer.setName("Razz");
		return customer;
	}
	

}
