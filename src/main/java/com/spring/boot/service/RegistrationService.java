package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.boot.dao.RegistrationDao;
import com.spring.boot.entity.Registration;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDao registrationDao;
	
	public Registration createRegistrations(Registration registration) {
		return registrationDao.save(registration);
	}
	
	@GetMapping("/allDetails")
	public List<Registration> getAllRegistrations(){
		
		return (List<Registration>) registrationDao.findAll();
	}
	

}
