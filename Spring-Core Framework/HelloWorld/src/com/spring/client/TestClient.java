package com.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.message.Message;

@SuppressWarnings("deprecation")
public class TestClient {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Object object = beanFactory.getBean("message");
		
		if(object!=null) {
			Message message = (Message)object;
			System.out.println(message.getMessageId() + " " + message.getMessage());
		}
		
	   System.out.println("===============================================");
	   Message message = beanFactory.getBean("message", Message.class);
	   System.out.println(message.getMessage() + " " + message.getMessageId());
	   System.out.println("===============================================");
	   String[] aliases = beanFactory.getAliases("message");
	   for (String alias:aliases) {
		System.out.println(alias);
		 System.out.println("===============================================");
		Class<?> cls = beanFactory.getType("message");
		System.out.println(cls.getName());
		System.out.println(beanFactory.isSingleton("message"));
		System.out.println(beanFactory.isPrototype("message"));
	}
	}

}
