package com.techie.client;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.techie.model.Employee;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=null;
		try {
		//	applicationContext = new FileSystemXmlApplicationContext("C:/Users/rashmi.mooljani/Documents/workspace-sts-3.9.7.RELEASE/SpringApplicationContext2Demo/src/Beans.xml");// absolute path - not recommended
			
			applicationContext = new FileSystemXmlApplicationContext("src/Beans.xml"); // relative path
			Employee employee = applicationContext.getBean("employee",Employee.class);
			System.out.println(employee.getName() + "  " + employee.getId());
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext)applicationContext).close();
		}
		
		
	}
}
