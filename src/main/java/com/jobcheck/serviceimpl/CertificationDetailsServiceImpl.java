package com.jobcheck.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobcheck.models.Certificate;
import com.jobcheck.models.CertificationDetails;
import com.jobcheck.repository.CertificateRepository;
import com.jobcheck.repository.CertificationDetailsRepository;
import com.jobcheck.service.CertificationDetailsService;



@Service
public class CertificationDetailsServiceImpl implements CertificationDetailsService {
	@Autowired
	CertificationDetailsRepository cRepo;
	@Autowired
	CertificateRepository cerRepo;
	

	@Override
	public CertificationDetails addCertificateDetails(long CertificateId, CertificationDetails details) {
		Certificate cd = cerRepo.getByCertificateId(CertificateId);
		cd.setCertificationDetails(details);
		cerRepo.save(cd);
		return cRepo.save(details);
		
	}


	@Override
	public CertificationDetails addCertificateDetails(CertificationDetails details) {
	
		return cRepo.save(details);
	}


	@Override
	public CertificationDetails editCertificateDetails(long certificateId, CertificationDetails details) {
		Certificate c = cerRepo.getByCertificateId(certificateId);
		c.setCertificationDetails(details);
		cerRepo.save(c);
		return c.getCertificationDetails();
		
		
	}
	

}