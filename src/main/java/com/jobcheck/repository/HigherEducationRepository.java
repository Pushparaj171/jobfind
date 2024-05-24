package com.jobcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobcheck.models.HigherEducation;

@Repository
public interface HigherEducationRepository extends JpaRepository<HigherEducation, Long>{

	@Query("from HigherEducation where id = ?1")
	 public HigherEducation getById(@Param(value ="id")long id);
}

re