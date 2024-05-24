package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.models.AreaOfInterest;
import com.jobcheck.service.AreaOfInterestService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class AreaOfInterestController {
	
	@Autowired
	AreaOfInterestService areaService;
	
	@GetMapping("/jobseekerprofile/areaofinterest")
	public ResponseEntity<?>get() {
		ResponseEntity<?> response = new ResponseEntity<>(areaService.getAreaOfInterest(),HttpStatus.OK);
	//	log.info("areaofinterest fetched successfully");
		return response;
	}
	

	    
	    @PostMapping("/jobSeekerProfile/{profileId}/{areaOfIntrest}")
	    public ResponseEntity<?> addAreaOfInterest(@PathVariable("profileId") long profileId, @PathVariable String areaOfIntrest) {
	        ResponseEntity<?> response = new ResponseEntity<AreaOfInterest>(areaService.addAreaOfInterest(profileId,areaOfIntrest), HttpStatus.OK);
	        return response;
	    

	    }

}
