package com.jobcheck.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.jobcheck.enumeration.NoticePeriod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long workExperienceId;
	
	private String jobTitle;
	
	private String company;
	
	private double salary;
	
	private String jobDesc;
	
	private boolean currentlyWorking;
	
	private NoticePeriod noticePeriod;
}
