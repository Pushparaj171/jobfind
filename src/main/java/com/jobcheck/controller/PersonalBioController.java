package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.exception.PersonNotExistException;
import com.jobcheck.models.PersonalBio;
import com.jobcheck.service.PersonalBioService;

@RestController
public class PersonalBioController {
	@Autowired
	PersonalBioService personalBioService;
    
    @PostMapping("/personId/{id}/personalBio")
    public ResponseEntity<?> addPersonalBioByPersonid(@PathVariable(value="id")long id , @RequestBody PersonalBio personalBio) throws PersonNotExistException {
        ResponseEntity<?> response = null;
            
                response = new ResponseEntity<>(personalBioService.addPersonalBioByPersonId(id,personalBio), HttpStatus.OK);
        return response;
    }
    
    @PutMapping("/personId/{id}/personalBio/{personalBioId}")
    public ResponseEntity<?> editPersonalBio(@PathVariable(value="id")long id,@PathVariable(value="personalBioId")long personalBioId , @RequestBody PersonalBio personalBio) throws PersonNotExistException {
        ResponseEntity<?> response = null;
            
                response = new ResponseEntity<>(personalBioService.editPersonalBioByPersonId(id,personalBioId, personalBio), HttpStatus.OK);
        return response;
    }
    
    @DeleteMapping("/personId/{id}/personalBio/{personalBioId}")
    public void deletePersonalBioId(@PathVariable(value="id") long id,@PathVariable(value="personalBioId")long personalBioId) throws PersonNotExistException{
        personalBioService.removePersonalBio(personalBioId, id);
    }

	    
	 
	    
	

}
