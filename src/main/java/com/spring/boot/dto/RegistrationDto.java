package com.spring.boot.dto;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrationDto extends RepresentationModel<RegistrationDto>{

	private Integer id;

	private String firstName;
	private String lastName;
	private List<CoursesDto> courses;

	public RegistrationDto() {
		super();
	}

	@JsonCreator
	public RegistrationDto(@JsonProperty Integer id, @JsonProperty String firstName, @JsonProperty String lastName,
			@JsonProperty List<CoursesDto> courses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = courses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<CoursesDto> getCourses() {
		return courses;
	}

	public void setCourses(List<CoursesDto> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "RegistrationDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", courses="
				+ courses + "]";
	}

	
}
