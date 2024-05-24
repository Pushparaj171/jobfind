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

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
@Entity
public class WorkLocation {
	
	public WorkLocation() {
		super();
	}

	public WorkLocation(long locationId, String location, List<JobPreference> jobPreference) {
		super();
		this.locationId = locationId;
		this.location = location;
		this.jobPreference = jobPreference;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<JobPreference> getJobPreference() {
		return jobPreference;
	}

	public void setJobPreference(List<JobPreference> jobPreference) {
		this.jobPreference = jobPreference;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long locationId;
	
	private String location;
	
	@ManyToMany(mappedBy = "workLocation")
	@JsonIgnore
	private List<JobPreference> jobPreference=new ArrayList<>();

}
