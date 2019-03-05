package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.ATM;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		ATM atm = abstractApplicationContext.getBean("atm",ATM.class);
		atm.printBalanceInfo("9876542345678");
		abstractApplicationContext.close();
	}

}
