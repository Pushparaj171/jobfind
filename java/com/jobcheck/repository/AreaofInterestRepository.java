package com.jobcheck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobcheck.models.AreaOfInterest;

@Repository
public interface AreaofInterestRepository extends JpaRepository<AreaOfInterest, Long>{
	
	@Query(value="select a from AreaOfInterest a")
	public List<AreaOfInterest> getareaofinterest();
	
	@Query(value="select a from AreaOfInterest a where a.areaOfIntrest= :areaOfIntrest")
    AreaOfInterest getObjectByName(@Param("areaOfIntrest") String areaOfIntrest);
}
