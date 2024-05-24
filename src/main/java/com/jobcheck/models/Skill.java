package com.jobcheck.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Skill {
	
	public Skill() {
		super();
	}

	public Skill(long skillId, String description, List<JobSeekerProfile> jobSeekerProfile) {
		super();
		this.skillId = skillId;
		this.description = description;
		this.jobSeekerProfile = jobSeekerProfile;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<JobSeekerProfile> getJobSeekerProfile() {
		return jobSeekerProfile;
	}

	public void setJobSeekerProfile(List<JobSeekerProfile> jobSeekerProfile) {
		this.jobSeekerProfile = jobSeekerProfile;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long skillId;
	
	private String description;
	
	@ManyToMany(mappedBy = "skill")
	@JsonIgnore
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
}
