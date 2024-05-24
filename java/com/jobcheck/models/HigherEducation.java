package com.jobcheck.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobcheck.enumeration.CourseType;
import com.jobcheck.enumeration.GradingSystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HigherEducation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long higherEducationId;
	private long marks;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private GradingSystem gradingSystem;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private CourseType courseType;
	
	@OneToMany
	@JoinColumn(name="universityId")
	private List<University> university=new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name="courseId")
	private List<Course> course=new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name="specializationId")
	private List<Specialization> specialization=new ArrayList<>();
}

