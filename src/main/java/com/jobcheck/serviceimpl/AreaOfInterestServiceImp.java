package com.jobcheck.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.models.AreaOfInterest;
import com.jobcheck.models.JobSeekerProfile;
import com.jobcheck.repository.AreaofInterestRepository;
import com.jobcheck.repository.JobSeekerProfileRepository;
import com.jobcheck.service.AreaOfInterestService;

@Service
public class AreaOfInterestServiceImp implements AreaOfInterestService {
	
	@Autowired
	AreaofInterestRepository areaRepo;
	
	@Autowired
    JobSeekerProfileRepository jobSeekerRepo;
	
	@Override
	public List<AreaOfInterest> getAreaOfInterest() {
		List<AreaOfInterest> areaIn = null;
		areaIn = areaRepo.getareaofinterest();
		return areaIn;
	}
	
	@Override
    public AreaOfInterest addAreaOfInterest(long profileId, String areaOfIntrest) {
        JobSeekerProfile jobSeekerProfile= jobSeekerRepo.getJobSeekerProfileById(profileId);
        List<AreaOfInterest> ai=jobSeekerProfile.getAreaOfInterest();
        AreaOfInterest a=areaRepo.getObjectByName(areaOfIntrest);
        ai.add(a);
        AreaOfInterest areaOfInterest=new AreaOfInterest();
        List<JobSeekerProfile> jp=new ArrayList<>();
        jp.add(jobSeekerProfile);
        areaOfInterest.setJobSeekerProfile(jp);
        jobSeekerProfile.setAreaOfInterest(ai);
        areaRepo.save(a);
        jobSeekerRepo.save(jobSeekerProfile);
        return a;
    }
}
