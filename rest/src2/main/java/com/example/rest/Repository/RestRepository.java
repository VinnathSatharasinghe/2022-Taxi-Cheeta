package com.example.rest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.Class.RestModel;

public interface RestRepository extends CrudRepository<RestModel, Long> {
	
	RestModel getById(Integer id);

}
