package com.iris.java8glimpse;

@FunctionalInterface
interface MyInterface1{
	public  void myMethod1();
	//public abstract void m1();
}

public class FunctionalInterfacelambda {
	
	public static void main(String... args) {
		MyInterface1 interface1 = () -> { System.out.println("I am impl of inetrface1");
		};
		
		interface1.myMethod1();
	}


}