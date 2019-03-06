package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.UserDetails;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		UserDetails userDetails =abstractApplicationContext.getBean("userBean",UserDetails.class);
		
		System.out.println(userDetails.toString());
		
		abstractApplicationContext.close();
	}
	
	

}
