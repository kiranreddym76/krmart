package com.example.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		
		System.out.println("check status of learn app--started");
		SpringApplication.run(LearningApplication.class, args);
		System.out.println("check status of learn app--successful run");
	}

}
