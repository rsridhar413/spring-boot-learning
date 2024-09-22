package com.learning.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.dependencyinjection.Inject;

@SpringBootApplication
@RestController
public class SpringbootApplication {
    public static void main(String[] args) {
    	ApplicationContext ac = SpringApplication.run(SpringbootApplication.class, args);
    	Inject inject = ac.getBean(Inject.class);
    	inject.injection();
    }
    
    
}