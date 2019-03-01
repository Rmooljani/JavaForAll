package com.techie.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Message;

public class TestClient {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Message msg = applicationContext.getBean("message", Message.class);
		System.out.println(msg.getMessage() + "  " + msg.getMessageId());
		
		 msg.setMessage("Hey champs"); msg.setMessageId(13243);
		 
		System.out.println(msg.getMessage() + " " + msg.getMessageId());
		
		Message msg1 = applicationContext.getBean("message", Message.class);
		System.out.println(msg1.getMessage() + " " + msg1.getMessageId());
		
		Message msg2 = applicationContext.getBean("message", Message.class);
		System.out.println(msg2.getMessage() + " " + msg2.getMessageId());
		
		System.out.println(System.identityHashCode(msg));
		System.out.println(System.identityHashCode(msg1));
		System.out.println(System.identityHashCode(msg2));
		((AbstractApplicationContext)applicationContext).close();
		
	}

}
