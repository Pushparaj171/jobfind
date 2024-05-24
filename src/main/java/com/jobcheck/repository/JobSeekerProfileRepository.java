package com.jobcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.jobcheck.models.JobSeekerProfile;

@Repository
public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Long>{
	
	@Query(value = "select j from JobSeekerProfile j where j.profileId=:id") 
    public JobSeekerProfile getJobSeekerProfileById(long id);
}
