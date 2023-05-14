package com.spring.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.spring.boot.dto.GreetingDto;
import com.spring.boot.entity.Student;
import com.spring.boot.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);

	private static final String TEMPLATE = "Hello, %s";

	@Autowired
	private StudentService studentService;

	
	@GetMapping("/studentDetails")
	public HttpEntity<List<Student>> getStudents() {
		List<Student> lists=studentService.getAllStudents();
		lists.forEach(student->student.add(linkTo(methodOn(StudentController.class).getStudents()).withSelfRel()));
		return new ResponseEntity<List<Student>>(lists, HttpStatus.OK);
	}

	@PostMapping("/saveStudent")
	public HttpEntity<Student> createStudent(@RequestBody Student student) {
		student=new Student();
		student=studentService.createStudent(student);
		student.add(linkTo(methodOn(StudentController.class).createStudent(student)).withSelfRel());
		return new ResponseEntity<>(student,HttpStatus.OK);
	}

	@GetMapping("/greeting")
	public HttpEntity<GreetingDto> greeting(@RequestParam(defaultValue = "World") String name) {
		GreetingDto dto = new GreetingDto(String.format(TEMPLATE, name));
		dto.add(linkTo(methodOn(StudentController.class).greeting(name)).withSelfRel());
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

}
