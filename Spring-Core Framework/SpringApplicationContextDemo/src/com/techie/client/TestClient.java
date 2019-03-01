package com.techie.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Employee;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee = applicationContext.getBean("employee",Employee.class);
		System.out.println(employee.getName() + "  " + employee.getId());
		((AbstractApplicationContext)applicationContext).close();
		
	}
}
