package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.StudentAccessor;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");

		StudentAccessor studentAccessor = abstractApplicationContext.getBean("studentAccessor",StudentAccessor.class);
		   System.out.println("=========================================================");
		   System.out.println("List of students : " + studentAccessor.getStudentNames());
            for(String snames:studentAccessor.getStudentNames()) {
            	System.out.println(snames.toString());
            }
            
            System.out.println("=========================================================");
            System.out.println("List of failed students : " + studentAccessor.getFailedStudents());
            System.out.println("=========================================================");
            System.out.println("List of passed students : " + studentAccessor.getPassedStudents());
            System.out.println("=========================================================");
            System.out.println("third student from list: " + studentAccessor.getThirdStudentInList());
            abstractApplicationContext.close();
	}

}
