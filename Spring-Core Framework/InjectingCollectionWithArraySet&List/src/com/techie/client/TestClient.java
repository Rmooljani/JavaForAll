package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.info.OrgInfo;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		OrgInfo info = abstractApplicationContext.getBean("orgInfo",OrgInfo.class);
		System.out.println("===================Array==================");
		for(String str:info.getNamesArr()) {
			System.out.println(str);
		}
		System.out.println("===================List==================");
		for(String listStr:info.getEmpNameList()) {
			System.out.println(listStr);
		}
		System.out.println("===================Set==================");
		for(Integer set:info.getEmpNameSet()) {
			System.out.println(set);
		}
		
		((AbstractApplicationContext)abstractApplicationContext).close();
	}

}
