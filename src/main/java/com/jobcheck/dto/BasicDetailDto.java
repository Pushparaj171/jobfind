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

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class BasicDetailDto {

	public BasicDetailDto() {
		super();
	}

	public BasicDetailDto(long detailsId, String fullName, String email, long phoneNumber, String year, Gender gender,
			Month month) {
		super();
		this.detailsId = detailsId;
		this.fullName = fullName;
		this.email = email;
		PhoneNumber = phoneNumber;
		this.year = year;
		this.gender = gender;
		this.month = month;
	}

	public long getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(long detailsId) {
		this.detailsId = detailsId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

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
