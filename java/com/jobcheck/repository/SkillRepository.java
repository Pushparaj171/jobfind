package com.jobcheck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jobcheck.models.Skill;


@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{
	
	@Query(value = "select s from Skill s")
	public List<Skill> getSkills();
}
