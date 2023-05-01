package com.spring.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootProjectApplication {

	@Value("${spring.application.name:SpringBootProjectApplication}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}
	
	@GetMapping("/")
	private String getApplicationName() {
		return name;
	}

}
