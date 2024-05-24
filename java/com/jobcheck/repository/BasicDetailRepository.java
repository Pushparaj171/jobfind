package com.jobcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobcheck.models.BasicDetail;

@Repository
public interface BasicDetailRepository extends JpaRepository<BasicDetail, Long>{
	
	

}
