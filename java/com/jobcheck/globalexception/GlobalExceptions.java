package com.jobcheck.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.jobcheck.exception.AreaOfIntresetNotExistException;
import com.jobcheck.exception.PersonNotExistException;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptions {
	
	
	@ExceptionHandler(PersonNotExistException.class)
	public ResponseEntity<?> PersonNotExistExceptionHandler(PersonNotExistException pe){
		
		ResponseEntity<?> response=new ResponseEntity<>("Person not found Exception",HttpStatus.BAD_REQUEST);
		return response;
	}
	
	
	@ExceptionHandler(AreaOfIntresetNotExistException.class)
	public ResponseEntity<?> AreaOfIntresetNotExistExceptionHandler(AreaOfIntresetNotExistException ae){
		ResponseEntity<?> response=new ResponseEntity<>("Area Of Intrest do not exist",HttpStatus.OK);
		return response;
	}

}