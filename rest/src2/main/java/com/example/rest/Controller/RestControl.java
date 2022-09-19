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

import com.example.rest.Class.RestModel;
import com.example.rest.Service.RestService;



@RestController
@CrossOrigin(origins = "*")
//@CrossOrigin("http://localhost:3000")
@RequestMapping("/api")
public class RestControl {
	
	@Autowired
	public RestService restService;
	
@PostMapping("/add")
public RestModel addOrUpdateRecord(@RequestBody RestModel restModel) {
	return restService.addBLMethod(restModel);	
}


@PutMapping("/edit/{id}")
public ResponseEntity<?> update(@RequestBody RestModel restModel,
		@PathVariable Integer id){
	try {
		RestModel restModel2 = restService.get(id);
	    restService.addBLMethod(restModel);
	    
	    return new ResponseEntity<>(HttpStatus.OK);
	}catch (NoSuchElementException e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}



@GetMapping("/all")
public Iterable<RestModel> findAllRecord() {
	return restService.findall();
}

@GetMapping("/find/{id}")
public RestModel findById(@PathVariable Integer id) {
	return restService.findById(id);	
}



@DeleteMapping("/delete/{id}")
public ResponseEntity<?> removeById(@PathVariable Integer id) {
	RestModel rm = restService.findById(id);
	restService.delete(rm);
	return new ResponseEntity<String>("Deleted", HttpStatus.OK);
}


}
