package com.spring.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Student;
import com.spring.boot.util.StudentUtil;

@RestController
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);

	@GetMapping("/hello")
	public String getMessage() {
		logger.info("message printed successfully.");
		return "Welcome to spring boot project.";
	}
	@GetMapping("/allStudents")
	public List<Student> getAllStudents(){
		return new StudentUtil().getLists();
	}

}
