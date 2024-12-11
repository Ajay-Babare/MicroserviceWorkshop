package com.ajay.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="01-Api")
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String welcome();
}
