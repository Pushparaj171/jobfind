package com.jobcheck.service;

import com.jobcheck.exception.HigherEducationNotFoundException;
import com.jobcheck.exception.MarksNotFoundException;
import com.jobcheck.models.HigherEducation;

public interface HigherEducationService {
	
	

	public HigherEducation  getMarksById(long id) throws HigherEducationNotFoundException;
	
	public HigherEducation editMarksById(long marks,long id);
	
	public HigherEducation addMarksById(long marks,long id);
	public HigherEducation deleteMarksById(long id) throws MarksNotFoundException;
	

}
