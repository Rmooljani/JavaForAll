package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.info.OrgInfo;
import com.techie.model.Student;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		OrgInfo info = abstractApplicationContext.getBean("orgInfo",OrgInfo.class);
		System.out.println("===================Array==================");
		for(Student str:info.getNamesArr()) {
			System.out.println(str.toString());
		}
		System.out.println("===================List==================");
		for(Student listStr:info.getStudentList()) {
			System.out.println(listStr.toString());
		}
		System.out.println("===================Set==================");
		for(Student set:info.getStudentSet()) {
			System.out.println(set.toString());
		}
		
		((AbstractApplicationContext)abstractApplicationContext).close();
	}

}
