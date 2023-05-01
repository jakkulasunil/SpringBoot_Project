package com.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to Spring Boot Project";
	}

}
