package com.spring.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);

	@GetMapping("/hello")
	public String getMessage() {
		logger.info("message printed successfully.");
		return "Welcome to spring boot project.";
	}

}
