package com.example.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.rest.Class.Driver;
import com.example.rest.Service.Driver_service;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Driver_control {
	

	@Autowired
	public Driver_service driver_service;
	

@PostMapping("/dr/add")
public Driver addOrUpdateRecord(@RequestBody Driver driver) {
	return driver_service.addBLMethod(driver);	
}


@GetMapping("/dr/all")
public Iterable<Driver> findAllRecord() {
	return driver_service.findall();
}

@GetMapping("/dr/find/{id}")
public Driver findById(@PathVariable Integer id) {
	return driver_service.findById(id);	
}



@DeleteMapping("/dr/delete/{id}")
public ResponseEntity<?> removeById(@PathVariable Integer id) {
	Driver rm = driver_service.findById(id);
	driver_service.delete(rm);
	return new ResponseEntity<String>("Deleted", HttpStatus.OK);
}



}
