package com.spring.boot;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.spring.boot.entity.Student;

@WebMvcTest
public class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;

	private Student student;

	@BeforeEach
	void init() {
		student = new Student();
		student.setId(1);
		student.setName("Sunil");
		student.setEmail("suni@gmail.com");
		student.setAge(32);
	}

	@Test
	public void getAllStudentDetails() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/studentDetails").accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk());
	}
}
