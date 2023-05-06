package com.spring.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Student;
import com.spring.boot.service.StudentService;
import com.spring.boot.util.StudentUtil;

@RestController
@RequestMapping("/students")
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/hello")
	public String getMessage() {
		logger.info("message printed successfully.");
		return "Welcome to spring boot project.";
	}
	
	@GetMapping("/allStudents")
	public List<Student> getAllStudents(){
		return new StudentUtil().getLists();
	}
	
	@PostMapping("/saveStudent")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

}
