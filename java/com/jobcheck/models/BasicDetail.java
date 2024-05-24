package com.jobcheck.models;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobcheck.enumeration.Gender;
import com.jobcheck.enumeration.Month;
import com.jobcheck.enumeration.WorkStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BasicDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long detailsId;
	
	private String fullName;
	private String email;
	private long PhoneNumber;
	private String imageUrl;
	private String year;
	
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private WorkStatus workStatus;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private Month month;
	
	
	
}
