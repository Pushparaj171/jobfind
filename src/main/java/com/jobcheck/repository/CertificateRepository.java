package com.jobcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobcheck.models.Certificate;


@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long>{

	

	@Query(" from Certificate where id = ?1")
	 public Certificate getByCertificateId(@Param(value ="id")long id);

}

