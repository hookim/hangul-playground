package com.example.controller;

import java.net.http.HttpResponse;
import java.util.Date;
import java.util.Random;

import org.springframework.http.HttpEntity;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.ApiRequest;
import com.example.dto.ApiResponse;
import com.example.util.FlipString;
import com.example.util.RandomString;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class RandomController {
	
	
	@PostMapping("/api/v1/randomProcess")
	public ApiResponse randomProcess(@RequestBody ApiRequest apiReq) {
		
		System.out.println(apiReq.getRandomString());
		
		ApiResponse res = new ApiResponse();
		
		
		res.setRandomString(RandomString.randomWord(apiReq.getRandomString()).toString());
		res.setDateTime(new Date());
		
		return res;
	}
	
	@PostMapping("/api/v1/flipProcess")
	public ApiResponse flipProcess(@RequestBody ApiRequest apiReq) {
		
//		System.out.println(apiReq.getRandomString());
		
		ApiResponse res = new ApiResponse();
		
		
		res.setRandomString(FlipString.flipHangul(apiReq.getRandomString()).toString());
		res.setDateTime(new Date());
		
		return res;
	}
}
