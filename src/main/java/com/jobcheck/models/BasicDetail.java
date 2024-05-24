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
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class BasicDetail {
	
	public BasicDetail() {
		super();
	}

	public BasicDetail(long detailsId, String fullName, String email, long phoneNumber, String imageUrl, String year,
			Gender gender, WorkStatus workStatus, Month month) {
		super();
		this.detailsId = detailsId;
		this.fullName = fullName;
		this.email = email;
		PhoneNumber = phoneNumber;
		this.imageUrl = imageUrl;
		this.year = year;
		this.gender = gender;
		this.workStatus = workStatus;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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

	public WorkStatus getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(WorkStatus workStatus) {
		this.workStatus = workStatus;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

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
