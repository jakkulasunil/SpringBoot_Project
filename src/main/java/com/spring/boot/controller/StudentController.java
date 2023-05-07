package com.spring.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Student;
import com.spring.boot.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;


	@GetMapping("/studentDetails")
	public ResponseEntity<List<Student>> getStudents(){
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);
	}
	
	@PostMapping("/saveStudent")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

}
