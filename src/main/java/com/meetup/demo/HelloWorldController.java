package com.meetup.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		LOGGER.info("Saying hello");
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
	
}
