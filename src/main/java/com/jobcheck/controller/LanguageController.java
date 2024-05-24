package com.jobcheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobcheck.models.Language;
import com.jobcheck.serviceimpl.LanguageServiceImpl;

@RestController
@RequestMapping(value = "Language")
public class LanguageController {
	@Autowired
	LanguageServiceImpl langServiceImpl;
    @PostMapping("/addLanguage")
    public ResponseEntity<?> post(@RequestBody Language lang)
    {
        ResponseEntity<?> response = new ResponseEntity<>(langServiceImpl.addLanguage(lang),HttpStatus.OK);
        return response;
    }
    @PutMapping("/editLanguage")
    public ResponseEntity<?> put(@RequestBody Language lang)
    {
        ResponseEntity<?> response = new ResponseEntity<>(langServiceImpl.editLanguage(lang),HttpStatus.OK);
        return response;
    }
    @DeleteMapping("/deleteLanguage/{id}")
    public ResponseEntity<?> put(@PathVariable long id)
    {
        ResponseEntity<?> response = new ResponseEntity<>(langServiceImpl.deleteLanguage(id),HttpStatus.OK);
        return response;
    }
    @GetMapping()
    public ResponseEntity<?> get()
    {
        ResponseEntity<?> response = new ResponseEntity<>(langServiceImpl.getLanguage(),HttpStatus.OK);
        return response;
    }
}
