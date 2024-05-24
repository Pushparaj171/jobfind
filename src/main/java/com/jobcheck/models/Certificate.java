package com.jobcheck.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long certificateId;
	
	private String certificateName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="certificationId")
	@JsonIgnore
	private CertificationDetails certificationDetails;
	
	@ManyToMany(mappedBy = "certificate")
	@JsonIgnore
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
}
