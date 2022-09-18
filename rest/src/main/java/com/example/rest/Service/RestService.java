package com.example.rest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.Class.RestModel;
import com.example.rest.Repository.RestRepository;

@Service
public class RestService {
	
	@Autowired
	private RestRepository restRepository;
	
	public RestModel addBLMethod(RestModel restModel) {
		return restRepository.save(restModel);
		
	}

	public Iterable<RestModel> findall() {
		return restRepository.findAll();
	}

	public RestModel findById(Integer id) {
		return restRepository.getById(id);
	}

	public void delete(RestModel restModel) {
		restRepository.delete(restModel);

	}
	
	public RestModel get(Integer id) {
		return restRepository.getById(id);
		
	}

}
