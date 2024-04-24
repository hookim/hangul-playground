package com.example.dto;

import org.springframework.stereotype.Component;

@Component
public class ApiRequest {
	private String randomString;

	public String getRandomString() {
		return randomString;
	}

	public void setRandomString(String randomString) {
		this.randomString = randomString;
	}
}
