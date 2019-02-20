package com.general.interview.programs.level1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		System.out.println("enter the number to find if it's Prime or not : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		findPrimeNumber(n);
		
		
	}
	
	public static boolean findPrimeNumber(int n) {
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
			System.out.println("entered number is not prime.");
			return false;
			}
		}
		System.out.println("entered number is prime.");
		return true;
	}
}
