package com.techie.client;

import com.techie.interfaces.Operation;

public class Test {
	
	public static void main(String[] args) {
		
		int x=30;
		int y=40;
		
		Operation operation = (n) -> System.out.println(n+y);
		operation.operate(20);
	}
	
	private static void doProcess(int i,Operation o) {
		o.operate(i);
	}

}
