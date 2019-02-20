package com.general.interview.programs.level1;

import java.util.Scanner;

public class SumOfNumbers {
	static int sum = 0;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//int[] num = scanner.nextInt();
		int[] num = {1,2,3,4};
		
		
		for(int i=0;i<num.length;i++) {
		//	System.out.println(num[i]);
			sum=sum + num[i];
			
		}
		System.out.println("sum of enetred numbers is:" + sum);
	}

}
