package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.exception.HigherEducationNotFoundException;
import com.jobcheck.exception.MarksNotFoundException;
import com.jobcheck.serviceimpl.HigherEducationServiceImpl;

@RestController
@RequestMapping(path="/HigherEducation")
public class HigherEducationController {
	
	@Autowired
	HigherEducationServiceImpl hESI;
	
	
	
	@GetMapping("/{id}/HigherEducation")
	public ResponseEntity<?> get(@PathVariable long id) throws HigherEducationNotFoundException{
		ResponseEntity<?> response = new ResponseEntity<>(hESI.getMarksById(id),HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/{id}/HigherEducation/{marks}")
	public ResponseEntity<?> put(@PathVariable (value = "id") long id,@PathVariable long marks){
		ResponseEntity<?>response = new ResponseEntity<>(hESI.editMarksById(marks, id),HttpStatus.OK);
		return response;
		
	}
	
	@PostMapping("/{id}/HigherEducation/{marks}")
	public ResponseEntity<?>post(@PathVariable long id,@PathVariable long marks){
		ResponseEntity<?>response = new ResponseEntity<>(hESI.addMarksById(marks, id),HttpStatus.OK);
		return response;
		
	}

    @DeleteMapping("/{id}/{marks}")
	public ResponseEntity<?>delete(@PathVariable long id) throws MarksNotFoundException{
		ResponseEntity<?>response = new ResponseEntity<>(hESI.deleteMarksById(id),HttpStatus.OK);
		return response;
		
	}

 
}
