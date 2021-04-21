package com.lascenzi.smsauthenticator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@SpringBootApplication
public class ApiApplication {

	static Logger logger = LoggerFactory.getLogger(ApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		logger.info("Hello Spring Boot!");
	}

}
