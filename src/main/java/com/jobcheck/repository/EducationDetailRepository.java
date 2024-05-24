package com.jobcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobcheck.models.EducationDetail;

@Repository
public interface EducationDetailRepository extends JpaRepository<EducationDetail, Long> {


	@Query("from EducationDetail where id = ?1")
	 public EducationDetail getById(@Param(value ="id")long id);

}