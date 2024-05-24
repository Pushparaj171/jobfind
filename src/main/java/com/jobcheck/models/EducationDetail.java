package com.jobcheck.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.jobcheck.enumeration.EnglishFluency;
import com.jobcheck.enumeration.HighestQualification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class EducationDetail {
	
	public EducationDetail() {
		super();
	}

	public EducationDetail(long educationDetailsId, HighestQualification highestQualification,
			EnglishFluency englishFluency, BasicEducation basicEducation, HigherEducation higherEducation) {
		super();
		this.educationDetailsId = educationDetailsId;
		this.highestQualification = highestQualification;
		this.englishFluency = englishFluency;
		this.basicEducation = basicEducation;
		this.higherEducation = higherEducation;
	}

	public long getEducationDetailsId() {
		return educationDetailsId;
	}

	public void setEducationDetailsId(long educationDetailsId) {
		this.educationDetailsId = educationDetailsId;
	}

	public HighestQualification getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(HighestQualification highestQualification) {
		this.highestQualification = highestQualification;
	}

	public EnglishFluency getEnglishFluency() {
		return englishFluency;
	}

	public void setEnglishFluency(EnglishFluency englishFluency) {
		this.englishFluency = englishFluency;
	}

	public BasicEducation getBasicEducation() {
		return basicEducation;
	}

	public void setBasicEducation(BasicEducation basicEducation) {
		this.basicEducation = basicEducation;
	}

	public HigherEducation getHigherEducation() {
		return higherEducation;
	}

	public void setHigherEducation(HigherEducation higherEducation) {
		this.higherEducation = higherEducation;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long educationDetailsId;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private HighestQualification highestQualification;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private EnglishFluency englishFluency;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="basicEducationId")
	@JsonIgnore
	private BasicEducation basicEducation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="higherEducationId")
	@JsonIgnore
	private HigherEducation higherEducation;
}
