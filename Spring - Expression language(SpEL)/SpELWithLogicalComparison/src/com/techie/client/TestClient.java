package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.ExamResult;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");

            ExamResult examResult = abstractApplicationContext.getBean("examResult",ExamResult.class);
            System.out.println("Cleared exam or not ? : " + examResult.isHasCleared());
     		System.out.println("Exam result : " + examResult.getResultMessage());
            abstractApplicationContext.close();
	}

}
