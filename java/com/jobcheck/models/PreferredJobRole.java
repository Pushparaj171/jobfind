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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PreferredJobRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobRoleId;
	
	private String jobRole;
	
	@ManyToMany(mappedBy = "preferredJobRole")
	@JsonIgnore
	private List<JobPreference> jobPreference=new ArrayList<>();
	

}
