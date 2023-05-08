package com.spring.boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COURSE_101")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;
	private String courseName;

	public Courses(Integer courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Courses() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
}
