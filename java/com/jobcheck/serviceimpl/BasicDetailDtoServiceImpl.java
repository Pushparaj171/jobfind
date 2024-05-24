package com.jobcheck.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.dto.BasicDetailDto;
import com.jobcheck.enumeration.Gender;
import com.jobcheck.enumeration.Month;
import com.jobcheck.models.BasicDetail;
import com.jobcheck.models.JobSeekerProfile;
import com.jobcheck.repository.BasicDetailRepository;
import com.jobcheck.repository.JobSeekerProfileRepository;
import com.jobcheck.service.BasicDetailDtoService;

@Service
public class BasicDetailDtoServiceImpl implements BasicDetailDtoService{
	
	@Autowired
	BasicDetailRepository basicDetailRepo;
	
	@Autowired
	JobSeekerProfileRepository jobSeekerProfileRepository;
	
	@Override
	public BasicDetail addBasicDetail(BasicDetailDto basicDetailDto,Gender gender,Month month) {
		BasicDetail bd=new BasicDetail();
		bd.setFullName(basicDetailDto.getFullName());
		bd.setEmail(basicDetailDto.getEmail());
		bd.setPhoneNumber(basicDetailDto.getPhoneNumber());
		bd.setGender(gender);
		bd.setMonth(month);
		bd.setYear(basicDetailDto.getYear());
		JobSeekerProfile jsp=new JobSeekerProfile();
		jsp.setBasicDetails(bd);
		basicDetailRepo.save(bd);
		jobSeekerProfileRepository.save(jsp);
		return bd;
	}

}
