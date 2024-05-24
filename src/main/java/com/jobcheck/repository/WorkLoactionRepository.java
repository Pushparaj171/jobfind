package com.jobcheck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jobcheck.models.WorkLocation;

public interface WorkLoactionRepository extends JpaRepository<WorkLocation, Long>{

	@Query(value="select wl from WorkLocation wl")
	List<WorkLocation> getAllWorkLocation();
}
