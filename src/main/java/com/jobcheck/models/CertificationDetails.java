package com.jobcheck.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CertificationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long certificationId;
	
	private String issuingOrganization;
	private String credentialId;
	private String credentialUrl;
}
