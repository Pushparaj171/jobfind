package com.jobcheck.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.exception.HigherEducationNotFoundException;
import com.jobcheck.exception.MarksNotFoundException;
import com.jobcheck.models.HigherEducation;
import com.jobcheck.repository.EducationDetailRepository;
import com.jobcheck.repository.HigherEducationRepository;
import com.jobcheck.service.HigherEducationService;

@Service
public class HigherEducationServiceImpl implements HigherEducationService {

	@Autowired
	HigherEducationRepository hERepo;
	@Autowired
	EducationDetailRepository eDRepo;
	
	@Override
	public HigherEducation getMarksById(long id) throws HigherEducationNotFoundException {
		if(hERepo.existsById(id)) {
			 HigherEducation  highereducation = hERepo.getById(id);
					 return highereducation;
		}else {
			throw new HigherEducationNotFoundException();
		}
	}
	@Override
	public HigherEducation editMarksById(long marks, long id) {
		HigherEducation higheredu = hERepo.getById(id);
		higheredu.setMarks(marks);
		return hERepo.save(higheredu) ;
	}
	@Override
	public HigherEducation addMarksById(long marks, long id) {
		HigherEducation he = hERepo.getById(id);
		he.setMarks(marks);
		return hERepo.save(he);
	}

    public HigherEducation deleteMarksById(long id) throws MarksNotFoundException {
		
		if(hERepo.getById(id)==null) {
			throw new MarksNotFoundException("marks not found");
		}else {
			HigherEducation hie = hERepo.getById(id);
			//hie.setMarks(null);
		 return hERepo.save(hie);
		
	
		}
	}

	
	


	
		

}



