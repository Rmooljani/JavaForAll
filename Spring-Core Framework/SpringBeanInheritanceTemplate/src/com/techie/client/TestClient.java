package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Employee;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee = abstractApplicationContext.getBean("employee", Employee.class);
        System.out.println(employee.getPanNo());
        ((AbstractApplicationContext)abstractApplicationContext).close();
	}

}
