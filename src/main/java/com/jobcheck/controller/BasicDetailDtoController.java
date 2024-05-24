package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.dto.BasicDetailDto;
import com.jobcheck.enumeration.Gender;
import com.jobcheck.enumeration.Month;
import com.jobcheck.service.BasicDetailDtoService;

@RestController
public class BasicDetailDtoController {

	@Autowired
	BasicDetailDtoService basicDetailDtoService;
		
		@PostMapping("jobseekerprofile/basicDetailDto/{gender}/{month}")
		public ResponseEntity<?> post(@RequestBody BasicDetailDto basicDetailDto,@PathVariable Gender gender,@PathVariable Month month){
			ResponseEntity<?> response=new ResponseEntity<>(basicDetailDtoService.addBasicDetail(basicDetailDto, gender,month),HttpStatus.OK);
			return response;
		}

}
