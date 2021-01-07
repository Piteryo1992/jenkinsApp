package com.example.jenkinsdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoAppApplication.class, args);
	}

	@GetMapping()
	public String get() {
		return "No Witam!";
	}
}
