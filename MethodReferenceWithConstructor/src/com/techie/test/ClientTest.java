package com.techie.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ClientTest {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4,9,33,78,65);
		numbers.forEach(System.out::println);
		System.out.println("========================================");
		
		ClientTest.findSquareRoots(numbers,Integer::new);
	}
	
	private static List<Double> findSquareRoots(List<Integer> numbers,Function<Integer, Integer> f){
		List<Double> results = new ArrayList<>();
		numbers.forEach(x->results.add(Math.sqrt(f.apply(x))));
		return results;
		
	}

}
