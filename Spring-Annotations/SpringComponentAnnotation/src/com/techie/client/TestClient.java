package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Employee;
import com.techie.model.Pancard;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee =abstractApplicationContext.getBean("employee",Employee.class);
		
		System.out.println(employee.toString());
		
		System.out.println("================================================");
		
		Pancard pancard = employee.getPancard();
		if(pancard!=null) {
			System.out.println(pancard.toString());
		}else {
			System.out.println("Pancard info is not available...");
		}
		abstractApplicationContext.close();
	}
	
	

}
