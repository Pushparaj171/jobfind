package com.jobcheck.service;

import java.util.List;

import com.jobcheck.models.JobSeekerProfile;
import com.jobcheck.models.Skill;

public interface SkillService {
	
	public Skill postSkills(Skill skill);
	
	public List<Skill> getSkills();
	
	public List<Skill> addSkillByProfilleId(long profileId,String skill);

}
