package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Employee;
import com.techie.model.Pancard;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee = abstractApplicationContext.getBean("employee",Employee.class);
		if(employee!=null) {
			System.out.println(employee.toString());
			Pancard pancard = employee.getPanNo();
			if(pancard!=null) {
				System.out.println(pancard.toString());
			}
		}
	
	//	System.out.println(employee.getPanNo().getPanHolderName() + " " + employee.getPanNo().getPanNo());
		abstractApplicationContext.close();
		
	}

}
