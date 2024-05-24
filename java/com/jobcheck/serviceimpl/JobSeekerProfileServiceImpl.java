package com.jobcheck.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.exception.JobSeekerNotFoundException;
import com.jobcheck.models.JobSeekerProfile;
import com.jobcheck.repository.JobSeekerProfileRepository;
import com.jobcheck.service.JobSeekerProfileService;

@Service
public class JobSeekerProfileServiceImpl implements JobSeekerProfileService {

	@Autowired
	JobSeekerProfileRepository jobSeekerProfileRepository;

	
}
