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
	public void init(); {
		log.info("Jenkin Application started..!");
		log.info("Added second log...Jenkin Application started..!");
	}
	public static void main(String[] args) {
		log.info("Jenkin Application executed...");
		log.info("Jenkin Application executed...2");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
