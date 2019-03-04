package com.techie.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Message;

public class TestClient {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
	
		applicationContext.start();
		Message message = applicationContext.getBean("message",Message.class);
		System.out.println(message.toString());
		applicationContext.stop();
		applicationContext.close();
		
	}

}
