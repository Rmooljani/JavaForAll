package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Student;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Student student = abstractApplicationContext.getBean("student",Student.class);
		System.out.println(student.toString());
		System.out.println();
		abstractApplicationContext.close();
	}

}
