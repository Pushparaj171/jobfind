package com.jobcheck.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class JobSeekerProfile {
	
	public JobSeekerProfile() {
		super();
	}

	public JobSeekerProfile(long profileId, BasicDetail basicDetails, List<JobPreference> jobPreference,
			List<AreaOfInterest> areaOfInterest, PersonalBio personalBio, List<WorkExperience> workExperience,
			List<Skill> skill, List<Language> language, List<Certificate> certificate,
			EducationDetail educationDetail) {
		super();
		this.profileId = profileId;
		this.basicDetails = basicDetails;
		this.jobPreference = jobPreference;
		this.areaOfInterest = areaOfInterest;
		this.personalBio = personalBio;
		this.workExperience = workExperience;
		this.skill = skill;
		this.language = language;
		this.certificate = certificate;
		this.educationDetail = educationDetail;
	}

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public BasicDetail getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(BasicDetail basicDetails) {
		this.basicDetails = basicDetails;
	}

	public List<JobPreference> getJobPreference() {
		return jobPreference;
	}

	public void setJobPreference(List<JobPreference> jobPreference) {
		this.jobPreference = jobPreference;
	}

	public List<AreaOfInterest> getAreaOfInterest() {
		return areaOfInterest;
	}

	public void setAreaOfInterest(List<AreaOfInterest> areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}

	public PersonalBio getPersonalBio() {
		return personalBio;
	}

	public void setPersonalBio(PersonalBio personalBio) {
		this.personalBio = personalBio;
	}

	public List<WorkExperience> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(List<WorkExperience> workExperience) {
		this.workExperience = workExperience;
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

	public List<Language> getLanguage() {
		return language;
	}

	public void setLanguage(List<Language> language) {
		this.language = language;
	}

	public List<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(List<Certificate> certificate) {
		this.certificate = certificate;
	}

	public EducationDetail getEducationDetail() {
		return educationDetail;
	}

	public void setEducationDetail(EducationDetail educationDetail) {
		this.educationDetail = educationDetail;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long profileId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="basicDetailsId")
	@JsonIgnore
	private BasicDetail basicDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="profileId")
	@JsonIgnore
	private List<JobPreference> jobPreference=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="profile_Area_Of_Interest_mapping",
	joinColumns=@JoinColumn(name="profileId"),
	inverseJoinColumns = @JoinColumn(name="areaInterestId"))
	@JsonIgnore
	private List<AreaOfInterest> areaOfInterest=new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="personalBioId")
	@JsonIgnore
	private PersonalBio personalBio;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="profileId")
	@JsonIgnore
	private List<WorkExperience> workExperience=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="profile_skills_mapping",
	joinColumns=@JoinColumn(name="profileId"),
	inverseJoinColumns = @JoinColumn(name="skillId"))
	@JsonIgnore
	private List<Skill> skill=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="profile_language_mapping",
	joinColumns=@JoinColumn(name="profileId"),
	inverseJoinColumns = @JoinColumn(name="languageId"))
	@JsonIgnore
	private List<Language> language=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="profile_certificate_mapping",
	joinColumns=@JoinColumn(name="profileId"),
	inverseJoinColumns = @JoinColumn(name="certificateId"))
	@JsonIgnore
	private List<Certificate> certificate=new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="educationDetailsId")
	@JsonIgnore
	private EducationDetail educationDetail;
	
			

}
