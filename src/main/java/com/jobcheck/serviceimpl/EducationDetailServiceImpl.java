package com.jobcheck.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.enumeration.EnglishFluency;
import com.jobcheck.models.EducationDetail;
import com.jobcheck.repository.EducationDetailRepository;
import com.jobcheck.service.EducationDetailService;

@Service
public class EducationDetailServiceImpl implements EducationDetailService {

	
	@Autowired
	 EducationDetailRepository eDRepo;
	
	

	@Override
	public EducationDetail addEnglish(long id, EnglishFluency english) {
		EducationDetail eng = eDRepo.getById(id);
		eng.setEnglishFluency(english);
		eDRepo.save(eng);
		return eng;
	}

	@Override
	public EducationDetail editEnglish(long id, EnglishFluency english) {
		EducationDetail engl = eDRepo.getById(id);
		engl.setEnglishFluency(english);
		eDRepo.save(engl);
		return engl;
		
	}

	@Override
	public EducationDetail deleteEnglish(long id) {
		EducationDetail engg = eDRepo.getById(id);
		engg.getEnglishFluency();
		eDRepo.save(engg);
		return engg;
		
	}

}


