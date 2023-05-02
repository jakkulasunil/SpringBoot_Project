package com.spring.boot.util;

import java.util.Arrays;
import java.util.List;

import com.spring.boot.entity.Student;

public class StudentUtil {
	private static int id=1;
	private List<Student> lists = null;
	
	public StudentUtil() {
		lists = Arrays.asList(new Student(id++, "Shiva", "Shiva@gmail.com", 24),
				new Student(id++, "Mahesh", "Mahesh@gmail.com", 25),
				new Student(id++, "Sharath", "Sharath@gmail.com", 23),
				new Student(id++, "Jagadeesh", "Jagadeesh@gmail.com", 27),
				new Student(id++, "Kittu", "Kittu@gmail.com", 20), new Student(id++, "Mani", "Mani@gmail.com", 26));

	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		StudentUtil.id = id;
	}

	public List<Student> getLists() {
		return lists;
	}

	public void setLists(List<Student> lists) {
		this.lists = lists;
	}
	
	

}
