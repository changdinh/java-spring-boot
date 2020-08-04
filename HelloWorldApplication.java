package com.helloworld.helloworld;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorldApplication {
	@RequestMapping("/")
	public String home() {
		return  "Hello world";
	}

	@RequestMapping("/new")
	public String newURL() {
		return "New";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
