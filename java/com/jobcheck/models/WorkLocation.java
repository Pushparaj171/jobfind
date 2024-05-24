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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class WorkLocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long locationId;
	
	private String location;
	
	@ManyToMany(mappedBy = "workLocation")
	@JsonIgnore
	private List<JobPreference> jobPreference=new ArrayList<>();

}
