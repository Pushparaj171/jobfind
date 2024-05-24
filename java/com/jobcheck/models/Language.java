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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long languageId;
	
	private String language;
	
	@ManyToMany(mappedBy = "language")
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
			

}
