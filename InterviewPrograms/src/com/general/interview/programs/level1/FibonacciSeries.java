package com.general.interview.programs.level1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int n=9;
		int sum=0;
		 System.out.println(num1);
		for(int i=1;i<=n;i++) {
			sum = num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
			
		}
	}

}
