package com.spring.boot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Registration;
import com.spring.boot.service.RegistrationService;

@RestController
@RequestMapping("/reg")
public class RegistrationController {
	
		
	@Autowired
	private RegistrationService registrationService;

	@GetMapping("/allDetails")
	public List<Registration> getAllRegistrations() {
		return registrationService.getAllRegistrations();
	}

	@PostMapping("/create")
	public ResponseEntity<Registration> createRegistrations(@RequestBody Registration registration) {
		return new ResponseEntity<Registration>(registrationService.createRegistrations(registration), HttpStatus.OK);
	}

}
