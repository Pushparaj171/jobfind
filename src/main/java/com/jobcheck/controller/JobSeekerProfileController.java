package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.exception.JobSeekerNotFoundException;
import com.jobcheck.models.Language;
import com.jobcheck.service.JobSeekerProfileService;
import com.jobcheck.serviceimpl.JobSeekerProfileServiceImpl;

@RestController
public class JobSeekerProfileController {
	
	
}
