package com.iris.java8glimpse;

@FunctionalInterface
interface Myinterface{
	public abstract void myMethod();
}

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		Myinterface myinterface = new Myinterface() {
			
			@Override
			public void myMethod() {
				System.out.println("I am impl of functional interface..");
				
			}
		};
		myinterface.myMethod();
		
	}

}
