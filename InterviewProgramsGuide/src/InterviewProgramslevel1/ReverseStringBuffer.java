package com.general.interview.programs.level1;

import java.util.Scanner;

public class ReverseStringBuffer {
	
	public static void main(String[] args) {
		
		System.out.println("Enter string to reverse....");
		Scanner scanner = new Scanner(System.in);
		String str =scanner.nextLine();
		
		StringBuffer stringBuffer = new StringBuffer(str);
		
		System.out.println(stringBuffer.reverse());
	}

}
