package com.general.interview.programs.level1;

public class ExceptionHandlingConcepts {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello....");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
