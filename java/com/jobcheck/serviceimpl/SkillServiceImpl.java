package com.jobcheck.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.models.JobPreference;
import com.jobcheck.models.JobSeekerProfile;
import com.jobcheck.models.Skill;
import com.jobcheck.repository.JobSeekerProfileRepository;
import com.jobcheck.repository.SkillRepository;
import com.jobcheck.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService{
	
	@Autowired
	SkillRepository skillRepo;
	
	@Autowired
	JobSeekerProfileRepository jpRepo;

	@Override
	public List<Skill> getSkills() {
		List<Skill> skill = null;
		skill = skillRepo.getSkills();
		return skill;
	}

	@Override
	public Skill postSkills(Skill skill) {
		Skill s =new Skill();
		s.setDescription(skill.getDescription());
		skillRepo.save(s);
		return s;
	}

	@Override
	public List<Skill> addSkillByProfilleId(long profileId,String skill) {
		JobSeekerProfile jsp = jpRepo.getJobSeekerProfileById(profileId);
		JobPreference jp = new JobPreference();
//		jp.set
		
		return null;
	}

}
