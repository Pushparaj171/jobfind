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
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class HigherEducation {
	public HigherEducation() {
		super();
	}

	public HigherEducation(long higherEducationId, long marks, GradingSystem gradingSystem, CourseType courseType,
			List<University> university, List<Course> course, List<Specialization> specialization) {
		super();
		this.higherEducationId = higherEducationId;
		this.marks = marks;
		this.gradingSystem = gradingSystem;
		this.courseType = courseType;
		this.university = university;
		this.course = course;
		this.specialization = specialization;
	}

	public long getHigherEducationId() {
		return higherEducationId;
	}

	public void setHigherEducationId(long higherEducationId) {
		this.higherEducationId = higherEducationId;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}

	public GradingSystem getGradingSystem() {
		return gradingSystem;
	}

	public void setGradingSystem(GradingSystem gradingSystem) {
		this.gradingSystem = gradingSystem;
	}

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public List<University> getUniversity() {
		return university;
	}

	public void setUniversity(List<University> university) {
		this.university = university;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Specialization> getSpecialization() {
		return specialization;
	}

	public void setSpecialization(List<Specialization> specialization) {
		this.specialization = specialization;
	}

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

