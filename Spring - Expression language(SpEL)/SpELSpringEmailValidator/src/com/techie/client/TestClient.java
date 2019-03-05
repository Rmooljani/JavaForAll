package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.EmailValidator;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");

		EmailValidator emailValidator = abstractApplicationContext.getBean("emailValidator",EmailValidator.class);
            System.out.println("Valid email or not ? : " + emailValidator.getIsValidEmail());
            abstractApplicationContext.close();
	}

}
