package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.event.handler.CustomEventPublisher;


public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
	
		CustomEventPublisher customEventPublisher = applicationContext.getBean("customEventPublisher" ,CustomEventPublisher.class);
		
		customEventPublisher.publishEvent();
	
		applicationContext.close();
		
	}

}
