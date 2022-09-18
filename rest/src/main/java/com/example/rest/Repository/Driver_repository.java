package com.example.rest.Repository;

import org.springframework.data.repository.CrudRepository;


import com.example.rest.Class.Driver;

public interface Driver_repository extends CrudRepository<Driver, Long> {

	Driver getById(Integer id);


}
