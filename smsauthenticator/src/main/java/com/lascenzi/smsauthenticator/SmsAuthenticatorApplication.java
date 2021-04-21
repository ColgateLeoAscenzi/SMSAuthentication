package com.lascenzi.smsauthenticator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@SpringBootApplication
public class SmsAuthenticatorApplication {

	static Logger logger = LoggerFactory.getLogger(SmsAuthenticatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SmsAuthenticatorApplication.class, args);
		logger.info("Hello Spring Boot!");
	}

}
