package com.jobcheck.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobcheck.enumeration.Board;
import com.jobcheck.enumeration.SchoolMedium;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BasicEducation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long basicEducationId;
	
	private String passingOutYear;
	
	private String totalMarks;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private Board board;

	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private SchoolMedium schoolMedium;
}
