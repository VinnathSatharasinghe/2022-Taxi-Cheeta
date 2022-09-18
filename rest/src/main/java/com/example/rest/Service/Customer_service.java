package com.example.rest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rest.Class.Customer;
import com.example.rest.Repository.Customer_repository;


@Service
public class Customer_service {
	
	@Autowired
	private Customer_repository customer_repository;
	
	public Customer addBLMethod(Customer customer) {
		return customer_repository.save(customer);
		
	}

	public Iterable<Customer> findall() {
		return customer_repository.findAll();
	}

	public Customer findById(Integer id) {
		return customer_repository.getById(id);
	}

	public void delete(Customer customer) {
		customer_repository.delete(customer);

	}
	public Customer get(Integer id) {
		return customer_repository.getById(id);
		
	}

}
