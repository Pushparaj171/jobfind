package com.jobcheck.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobcheck.enumeration.EmployementType;
import com.jobcheck.enumeration.JobType;
import com.jobcheck.enumeration.PreferedShift;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobPreference {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobPreferenceId;
	
	private double expectedSalary;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private JobType jobtype;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private EmployementType employementType;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private PreferedShift preferedShift;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="jobPreference_workLocation_mapping",
	joinColumns=@JoinColumn(name="jobPreferenceId"),
	inverseJoinColumns = @JoinColumn(name="workLocationId"))
	@JsonIgnore
	private List<WorkLocation> workLocation=new ArrayList<>();

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="jobPreference_JobRole_mapping",
	joinColumns=@JoinColumn(name="jobPreferenceId"),
	inverseJoinColumns = @JoinColumn(name="jobRoleId"))
	@JsonIgnore
	private List<PreferredJobRole> preferredJobRole=new ArrayList<>();
	
	

	
}
