
package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.models.CertificationDetails;
import com.jobcheck.serviceimpl.CertificationDetailsServiceImpl;

@RestController
public class CertificationDetailsController {
	
	@Autowired
	CertificationDetailsServiceImpl cDSI;
	
	@PostMapping("/certificate/{id}/certificationdetails")
	public ResponseEntity<?>post(@PathVariable long id,@RequestBody CertificationDetails details ){
		ResponseEntity<?>response = new ResponseEntity<>(cDSI.addCertificateDetails(id, details),HttpStatus.OK);
		return response;
		
	}
	

	@PostMapping("/certificate/certificationdetails")
	public ResponseEntity<?>post(@RequestBody CertificationDetails details ){
		ResponseEntity<?>response = new ResponseEntity<>(cDSI.addCertificateDetails(details),HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/certificate/{id}/certificationdetails")
	public ResponseEntity<?>put(@PathVariable long id,@RequestBody CertificationDetails details ){
		ResponseEntity<?>response = new ResponseEntity<>(cDSI.editCertificateDetails(id, details),HttpStatus.OK);
		return response;
		
	}

}
