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

import com.example.rest.Class.Admin;
import com.example.rest.Service.Admin_service;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Admin_control {
	

	@Autowired
	public Admin_service admin_service;
	

@PostMapping("/ad/add")
public Admin addOrUpdateRecord(@RequestBody Admin admin) {
	return admin_service.addBLMethod(admin);	
}


@GetMapping("/ad/all")
public Iterable<Admin> findAllRecord() {
	return admin_service.findall();
}

@GetMapping("/ad/find/{id}")
public Admin findById(@PathVariable Integer id) {
	return admin_service.findById(id);	
}


@DeleteMapping("/ad/delete/{id}")
public ResponseEntity<?> removeById(@PathVariable Integer id) {
	Admin rm = admin_service.findById(id);
	admin_service.delete(rm);
	return new ResponseEntity<String>("Deleted", HttpStatus.OK);
}

}
