package com.api.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello!!!!!";
	}
	

}
