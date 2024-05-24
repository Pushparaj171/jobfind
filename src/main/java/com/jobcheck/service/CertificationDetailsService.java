package com.jobcheck.service;

import com.jobcheck.models.CertificationDetails;

public interface CertificationDetailsService {
	
	public CertificationDetails addCertificateDetails(long CertificateId, CertificationDetails details);

	public CertificationDetails addCertificateDetails(CertificationDetails details);
	
	public CertificationDetails editCertificateDetails(long certificateId, CertificationDetails details);


}