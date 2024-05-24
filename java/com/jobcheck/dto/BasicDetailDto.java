package com.jobcheck.dto;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobcheck.enumeration.Gender;
import com.jobcheck.enumeration.Month;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicDetailDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long detailsId;
	
	private String fullName;
	private String email;
	private long PhoneNumber;
	private String year;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private Month month;
}
