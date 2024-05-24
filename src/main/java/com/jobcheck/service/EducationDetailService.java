package com.jobcheck.service;

import com.jobcheck.enumeration.EnglishFluency;
import com.jobcheck.models.EducationDetail;

public interface EducationDetailService {
	
	
	
	public EducationDetail addEnglish(long id,EnglishFluency english);
	
	public EducationDetail editEnglish(long id,EnglishFluency english);
	
	public EducationDetail deleteEnglish(long id);



}
