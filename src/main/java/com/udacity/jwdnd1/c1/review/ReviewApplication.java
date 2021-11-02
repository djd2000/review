package com.udacity.jwdnd1.c1.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReviewApplication implements CommandLineRunner {

	@Autowired
	private String lowerCaseMessage;

	@Autowired
	private String upperCaseMessage;

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(lowerCaseMessage);
		System.out.println(upperCaseMessage);
	}
}
