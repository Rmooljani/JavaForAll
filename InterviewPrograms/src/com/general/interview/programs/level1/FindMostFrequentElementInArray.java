package com.general.interview.programs.level1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostFrequentElementInArray {
	
public static void main(String[] args) {
		
		Integer arr[] = new Integer[]{3,5,7,8,3,7,4,3,9};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		
        int element = 0;
        int frequency = 1;
        
		for(Entry<Integer, Integer> i :entry) {
		/*	if(i.getValue()>1) {
			System.out.println("Repeated Number : " + i.getKey());
			System.out.println("It's Frequency : " + i.getValue());
			}*/ if(i.getValue()>frequency) {
				element = i.getKey();
				frequency = i.getValue();
				System.out.println("===================================== ");
				System.out.println("Most frequent element : " +element);
				System.out.println("Most frequent element's frequency : " +frequency);
			}
		}
	}
}
