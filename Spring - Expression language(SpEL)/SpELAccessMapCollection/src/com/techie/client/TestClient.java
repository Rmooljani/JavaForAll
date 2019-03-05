package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.TelephoneDirectoryAccessor;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");

		TelephoneDirectoryAccessor directoryAccessor = abstractApplicationContext.getBean("telephoneDirectoryAccessor",TelephoneDirectoryAccessor.class);
		   System.out.println("=========================================================");
		   System.out.println("Telephone Number : " + directoryAccessor.getTelephoneNumber());
           
            abstractApplicationContext.close();
	}

}
