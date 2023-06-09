package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.StudentDao;
import com.spring.boot.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public Student createStudent(Student student) {
		return studentDao.save(student);
	}
	
	public List<Student> getAllStudents(){
		return (List<Student>) studentDao.findAll();
	}
	
}
