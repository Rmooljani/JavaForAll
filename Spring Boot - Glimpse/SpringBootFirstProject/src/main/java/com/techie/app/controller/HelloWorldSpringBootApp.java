package com.techie.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringBootApp {
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello World";
	}

}
