package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jobcheck.models.WorkLocation;
import com.jobcheck.service.WorkLocationService;

public class WorkLocationController {
	
	@Autowired
	WorkLocationService workLocationService;
	
	@GetMapping("/workLocation")
	public ResponseEntity<?> get(){
		ResponseEntity<?> response=new ResponseEntity<>(workLocationService.getWorkLocation(),HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/workLocation")
	public ResponseEntity<?> post(@RequestBody WorkLocation workLocation){
		ResponseEntity<?> response=new ResponseEntity<>(workLocationService.addWorkLocation(workLocation),HttpStatus.OK);
		return response;
	}
}
