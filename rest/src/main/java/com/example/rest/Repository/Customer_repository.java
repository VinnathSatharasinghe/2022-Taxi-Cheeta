package com.example.rest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.Class.Customer;



public interface Customer_repository extends CrudRepository<Customer, Long> {
	
	Customer getById(Integer id);

}
