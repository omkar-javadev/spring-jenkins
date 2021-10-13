package com.example.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	
	private static final Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		log.info("Jenkin Application started...");
	}
	public static void main(String[] args) {
		log.info("Jenkin Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
