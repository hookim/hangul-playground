package com.example.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ApiResponse {

	private String randomString;
	private Date dateTime;
	public String getRandomString() {
		return randomString;
	}
	public void setRandomString(String randomString) {
		this.randomString = randomString;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
}
