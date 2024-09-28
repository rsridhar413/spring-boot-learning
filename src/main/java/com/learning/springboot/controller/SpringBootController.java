package com.learning.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@RequestMapping("/")
	public String greet() {
		return "Welcome!!!";
	}
}
