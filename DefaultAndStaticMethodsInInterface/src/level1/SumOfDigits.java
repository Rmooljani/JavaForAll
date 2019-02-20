package com.general.interview.programs.level1;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String... args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int rem;
		int sum=0;
		
		while(num>0) {
			rem = num%10;
			num = num/10;
			sum+=rem;
			
		}
		System.out.println("sum is:" +sum);
	}
	
}


