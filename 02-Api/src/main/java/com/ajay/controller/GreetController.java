package com.ajay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.client.WelcomeFeignClient;

@RestController
public class GreetController {

	@Autowired
	private WelcomeFeignClient client;
	
	@GetMapping("/greet")
	public String greet() {
		
		String msg = client.welcome();
		return "Good Morning from microservice 2, "+msg;
	}
}
