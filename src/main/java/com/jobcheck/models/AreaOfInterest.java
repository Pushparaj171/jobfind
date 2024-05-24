package com.jobcheck.models;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class AreaOfInterest {
	
	public AreaOfInterest() {
		super();
	}

	public AreaOfInterest(long areaInterestId, String areaOfIntrest, List<JobSeekerProfile> jobSeekerProfile) {
		super();
		this.areaInterestId = areaInterestId;
		this.areaOfIntrest = areaOfIntrest;
		this.jobSeekerProfile = jobSeekerProfile;
	}

	public long getAreaInterestId() {
		return areaInterestId;
	}

	public void setAreaInterestId(long areaInterestId) {
		this.areaInterestId = areaInterestId;
	}

	public String getAreaOfIntrest() {
		return areaOfIntrest;
	}

	public void setAreaOfIntrest(String areaOfIntrest) {
		this.areaOfIntrest = areaOfIntrest;
	}

	public List<JobSeekerProfile> getJobSeekerProfile() {
		return jobSeekerProfile;
	}

	public void setJobSeekerProfile(List<JobSeekerProfile> jobSeekerProfile) {
		this.jobSeekerProfile = jobSeekerProfile;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long areaInterestId;
	
	private String areaOfIntrest;
	
	@ManyToMany(mappedBy = "areaOfInterest")
	@JsonIgnore
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
	
}
