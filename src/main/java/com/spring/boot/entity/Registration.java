package com.spring.boot.entity;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "REG_101")
public class Registration extends RepresentationModel<Registration> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String firstName;
	private String lastName;

	@ManyToMany(targetEntity = Courses.class, cascade = { CascadeType.ALL })
	@JoinTable(name = "R_COURSE_101", joinColumns = { @JoinColumn(name = "reg_id") }, inverseJoinColumns = {
			@JoinColumn(name = "course_Id") })
	private List<Courses> courses;

	public Registration() {
		super();
	}

	@JsonCreator
	public Registration(@JsonProperty Integer id, @JsonProperty String firstName, @JsonProperty String lastName,
			@JsonProperty List<Courses> courses) {
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

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", courses=" + courses
				+ "]";
	}

}
