package com.general.interview.programs.level1;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to get it reversed...");
		String str = scanner.nextLine();
		char temp=0;
		
		char[] ch = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(ch[i]);
			}
	}

}
