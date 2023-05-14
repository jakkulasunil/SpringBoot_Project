package com.spring.boot.dto;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GreetingDto extends RepresentationModel<GreetingDto> {

	private final String content;

	@JsonCreator
	public GreetingDto(@JsonProperty("content") String content) {
		// TODO Auto-generated constructor stub
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
