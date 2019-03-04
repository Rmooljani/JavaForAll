package com.techie.client;

import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.UserInfo;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		UserInfo userInfo = applicationContext.getBean("userInfo",UserInfo.class);
		Properties properties = userInfo.getUserInfo();
		
		for (Entry<Object, Object> string : properties.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());
		}
		
		((AbstractApplicationContext)applicationContext).close();
		
	}

}
