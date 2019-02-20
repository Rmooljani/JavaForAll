package com.general.interview.programs.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfWords {
	
	public static void main(String[] args) {
		
		System.out.println("Enter statement to find frequency of words...");
		
		Scanner scanner = new Scanner(System.in);
		
		String stmt = scanner.nextLine();
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, stmt);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key is:: " + entry.getKey());
			System.out.println( "Value is:: "  + entry.getValue());
		}
		
	}

}
