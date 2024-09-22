package com.learning.springboot.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // if more than one class implements interface then need to use this annotation
public class Desktop implements Computer {

	@Override
	public void compile() {
		System.out.println("Desktop");
	}

}
