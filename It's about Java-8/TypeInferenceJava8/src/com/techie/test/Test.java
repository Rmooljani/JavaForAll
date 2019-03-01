package com.techie.test;

public class Test {
	
	public static void main(String[] args) {
		
		MyComparator comparator	 =(num1,num2)-> num1>num2;
		
		boolean compare = comparator.compare(20, 30);
		
		System.out.println(compare);
	}

}
