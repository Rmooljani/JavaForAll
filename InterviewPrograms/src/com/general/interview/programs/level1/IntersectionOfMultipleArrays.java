package com.general.interview.programs.level1;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfMultipleArrays {
	
	public static void main(String[] args) {
		Integer[] inputArray1 = {2, 3, 4, 7, 1};
        Integer[] inputArray2 = {4, 1, 3, 5};
        Integer[] inputArray3 = {8, 4, 6, 2, 1};
        Integer[] inputArray4 = {7, 9, 4, 1};
        intsection(inputArray1,inputArray2,inputArray3,inputArray4);
        
	}
	
	public static void intsection(Integer[]... inputArrays) {
		
	/*	for(Integer[] inputArray:inputArrays) {
			System.out.println(Arrays.toString(inputArray));
		}*/
		
		HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[0]));
		for(int i=0;i<inputArrays.length;i++) {
			HashSet<Integer> set1 = new HashSet<>(Arrays.asList(inputArrays[i]));
			set.retainAll(set1);
		}
		System.out.println("Intersection of all arrays..." + set);
	}

}
