package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Message;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Message message =abstractApplicationContext.getBean("message",Message.class);
		System.out.println(message.toString());
		abstractApplicationContext.close();
	}
	
	

}
