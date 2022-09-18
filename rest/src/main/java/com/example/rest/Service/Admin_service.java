package com.example.rest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.Class.Admin;
import com.example.rest.Repository.Admin_repository;

@Service
public class Admin_service {
	
	@Autowired
	private Admin_repository admin_repository;
	
	public Admin addBLMethod(Admin admin) {
		return admin_repository.save(admin);
		
	}

	public Iterable<Admin> findall() {
		return admin_repository.findAll();
	}

	public Admin findById(Integer id) {
		return admin_repository.getById(id);
	}

	public void delete(Admin admin) {
		admin_repository.delete(admin);

	}

}
