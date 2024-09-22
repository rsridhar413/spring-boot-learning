package com.learning.springboot.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Machine {
	
	public void build() {
		System.out.println("compiled without error...");
	}
}
