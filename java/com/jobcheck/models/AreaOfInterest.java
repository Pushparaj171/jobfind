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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AreaOfInterest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long areaInterestId;
	
	private String areaOfIntrest;
	
	@ManyToMany(mappedBy = "areaOfInterest")
	@JsonIgnore
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
	
}
