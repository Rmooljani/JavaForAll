package com.techie.client;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.info.OrgInfo;
import com.techie.model.Student;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		OrgInfo info = abstractApplicationContext.getBean("orgInfo",OrgInfo.class);
		System.out.println("===================Employee Map==================");
		for(Map.Entry<Integer, String> map1 :info.getEmpAndNamemap().entrySet()) {
			System.out.println(map1.getKey() + " " + map1.getValue() );
		}
		
		System.out.println("===================Student Map==================");
		for(Map.Entry<Integer, Student> map1 :info.getStudentIdMap().entrySet()) {
			System.out.println(map1.getKey() + " " + map1.getValue() );
		}
		
		((AbstractApplicationContext)abstractApplicationContext).close();
	}

}
