package com.example.rest.Controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.Class.Customer;
import com.example.rest.Service.Customer_service;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Customer_control {
	
	
	@Autowired
	public Customer_service customer_service;
	

@PostMapping("/cus/add")
public Customer addOrUpdateRecord(@RequestBody Customer customer) {
	return customer_service.addBLMethod(customer);	
}


@GetMapping("/cus/all")
public Iterable<Customer> findAllRecord() {
	return customer_service.findall();
}

@PutMapping("/cus/edit/{id}")
public ResponseEntity<?> updatecus(@RequestBody Customer customer,
		@PathVariable Integer id){
	try {
		Customer customerl2 =  customer_service.get(id);
		 customer_service.addBLMethod(customer);
	    
	    return new ResponseEntity<>(HttpStatus.OK);
	}catch (NoSuchElementException e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}


@GetMapping("/cus/find/{id}")
public Customer findById(@PathVariable Integer id) {
	return customer_service.findById(id);	
}



@DeleteMapping("/cus/delete/{id}")
public ResponseEntity<?> removeById(@PathVariable Integer id) {
	Customer rm = customer_service.findById(id);
	customer_service.delete(rm);
	return new ResponseEntity<String>("Deleted", HttpStatus.OK);
}

}
