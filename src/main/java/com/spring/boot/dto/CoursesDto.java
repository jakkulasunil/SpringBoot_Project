package com.spring.boot.dto;

import org.springframework.hateoas.RepresentationModel;

public class CoursesDto extends RepresentationModel<CoursesDto> {

	
	private Integer courseId;
	private String courseName;

	
	public CoursesDto(Integer courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public CoursesDto() {
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
