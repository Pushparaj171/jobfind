package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.enumeration.EnglishFluency;
import com.jobcheck.serviceimpl.EducationDetailServiceImpl;

@RestController
@RequestMapping(path="/EducationDetail")
		
public class EducationDetailController {
	
	@Autowired
	EducationDetailServiceImpl eDSI;

	
	
	@PostMapping("/{id}/{englishfluency}")
	public ResponseEntity<?> post(@PathVariable long id,@PathVariable  EnglishFluency englishfluency){
		ResponseEntity<?>response= new ResponseEntity<>(eDSI.addEnglish(id, englishfluency),HttpStatus.OK);
		return response;
	}
	
	@PutMapping("{id}/{englishfluency}")
	public ResponseEntity<?> put(@PathVariable long id,@PathVariable  EnglishFluency englishfluency){
		ResponseEntity<?>response= new ResponseEntity<>(eDSI.editEnglish(id, englishfluency),HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable long id){
		ResponseEntity<?>response= new ResponseEntity<>(eDSI.deleteEnglish(id),HttpStatus.OK);
		return response;
	}

}
