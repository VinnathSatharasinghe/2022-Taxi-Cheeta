package com.example.rest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.Class.Admin;


public interface Admin_repository extends CrudRepository<Admin, Long> {
	
	Admin getById(Integer id);

}
