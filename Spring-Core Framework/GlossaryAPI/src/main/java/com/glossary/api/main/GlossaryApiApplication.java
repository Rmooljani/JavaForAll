package com.glossary.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.glossary.controller.GlossaryController;
import com.glossary.services.GlossaryService;

@SpringBootApplication
@ComponentScan(basePackageClasses=GlossaryController.class)
@ComponentScan(basePackageClasses=GlossaryService.class)

public class GlossaryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlossaryApiApplication.class, args);
	}

}
