package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.RandomNumberGenerator;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");

            RandomNumberGenerator generator = abstractApplicationContext.getBean("randomNumberGenerator",RandomNumberGenerator.class);
     		System.out.println("Random Number : " + generator.getRandomNumber());
     		System.out.println("Value of PI : " + generator.getPi());
            abstractApplicationContext.close();
	}

}
