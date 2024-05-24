package com.jobcheck.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Language {
	
	public Language() {
		super();
	}

	public Language(long languageId, String language, List<JobSeekerProfile> jobSeekerProfile) {
		super();
		this.languageId = languageId;
		this.language = language;
		this.jobSeekerProfile = jobSeekerProfile;
	}

	public long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(long languageId) {
		this.languageId = languageId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<JobSeekerProfile> getJobSeekerProfile() {
		return jobSeekerProfile;
	}

	public void setJobSeekerProfile(List<JobSeekerProfile> jobSeekerProfile) {
		this.jobSeekerProfile = jobSeekerProfile;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long languageId;
	
	private String language;
	
	@ManyToMany(mappedBy = "language")
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
			

}
