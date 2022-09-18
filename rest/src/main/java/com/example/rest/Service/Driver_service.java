package com.example.rest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.rest.Class.Driver;
import com.example.rest.Repository.Driver_repository;


@Service
public class Driver_service {
	
	@Autowired
	private Driver_repository driver_repository;
	
	public Driver addBLMethod(Driver driver) {
		return driver_repository.save(driver);
		
	}

	public Iterable<Driver> findall() {
		return driver_repository.findAll();
	}

	public Driver findById(Integer id) {
		return driver_repository.getById(id);
	}

	public void delete(Driver driver) {
		driver_repository.delete(driver);

	}


}
