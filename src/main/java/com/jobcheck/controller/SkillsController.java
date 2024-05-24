package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.models.Skill;
import com.jobcheck.service.SkillService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class SkillsController {

	@Autowired
	SkillService skillSer;
	
	@PostMapping("/jobseekerprofile/skill")
	public ResponseEntity<?>post(@RequestBody Skill skill){
		ResponseEntity<?> response = new ResponseEntity<>(skillSer.postSkills(skill),HttpStatus.OK);
	//log.info("Skills added successfully");
		return response;
	}
	
	@GetMapping("jobseekerprofile/skill")
	public ResponseEntity<?>get() {
		ResponseEntity<?> response = new ResponseEntity<>(skillSer.getSkills(),HttpStatus.OK);
		//log.info("skills fetched successfully");
		return response;
	}
	
	@PostMapping("\"/jobSeekerProfile/{profileId}/{skill}\"")
	public ResponseEntity<?> addSkills(@PathVariable("profileId")long profileId,@PathVariable String skill){
		ResponseEntity<?> response = new ResponseEntity<>(skillSer.addSkillByProfilleId(profileId, skill),HttpStatus.OK);
		return response;
	}
	
}
