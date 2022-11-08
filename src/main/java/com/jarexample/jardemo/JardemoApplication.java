package com.jarexample.jardemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class JardemoApplication {
	public static Logger logger = LoggerFactory.getLogger(JardemoApplication.class);

	@GetMapping("/test")
	public String test() {
		return "Welcome to test Mapping";
	}

	@GetMapping("/world")
	public String world() {
		return "Welcome to world Mapping";
	}

	@PostConstruct
	public void init() {
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(JardemoApplication.class, args);
	}

}
