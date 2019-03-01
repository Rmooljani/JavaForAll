package com.techie.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.service.Communication;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Communication communication = applicationContext.getBean("communication", Communication.class);
		communication.communicate();
	}
}
