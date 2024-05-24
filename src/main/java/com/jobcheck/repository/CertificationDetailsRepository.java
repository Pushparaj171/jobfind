package com.jobcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.jobcheck.models.CertificationDetails;

@Repository
public interface CertificationDetailsRepository extends JpaRepository<CertificationDetails, Long>{

	@Query(" from CertificationDetails where id = ?1")
	 public CertificationDetails getByCertificationDetailsId(@Param(value ="id")long id);

}