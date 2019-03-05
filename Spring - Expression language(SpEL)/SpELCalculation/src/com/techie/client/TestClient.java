package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.PerimeterCalculator;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");

            PerimeterCalculator calculator = abstractApplicationContext.getBean("perimeterCalculator",PerimeterCalculator.class);
     		System.out.println("Perimeter of Rectangle : " + calculator.getPerimeter());
            abstractApplicationContext.close();
	}

}
