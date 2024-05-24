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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobSeekerProfile {
	
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
