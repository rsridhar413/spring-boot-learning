package com.learning.springboot.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Inject {

//	@Autowired   // field injection
	private Machine mc;

	// constructor injection
//	public Inject (Machine mc) {
//		this.mc = mc;
//	}

	@Autowired
	@Qualifier("laptop") // if more than one class implements interface then need to use this annotation
							// and the parameter name is lower camel case of class name.
	private Computer pc;

	@Autowired // setter injection
	public void setMachine(Machine mc) {
		this.mc = mc;
	}

	public void injection() {
		System.out.println("Dependency is injected...");
		mc.build();
		pc.compile();
	}
}
