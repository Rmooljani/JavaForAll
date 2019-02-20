package com.general.interview.programs.level1;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter a number to reverse....");
	    Scanner scanner = new Scanner(System.in);
	    Integer num = scanner.nextInt();
	    int rem=0,rev=0;
	    
	    while(num>0) {
	    	rem = num%10;
	    	num=num/10;
	    	rev = (rev*10)+rem;
	    }
	    System.out.println(rev);
	}

}
