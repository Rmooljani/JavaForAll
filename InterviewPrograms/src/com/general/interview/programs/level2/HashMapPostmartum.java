package com.general.interview.programs.level2;

import java.util.HashMap;
import java.util.Map;

public class HashMapPostmartum {
	
	public static void main(String[] args) {
	
		Map<Integer, String> map = new  HashMap<>();
		map.put(111, "Rock");
		map.put(222, "Mock");
		map.put(22, "Test");
		map.put(122, "Test122");
		map.put(133, "Oak");
		map.put(233, "Joke");
		map.put(333, "Soak");
		map.put(1, "Rock");
		map.put(2, "Mock");
		map.put(232, "Test");
		map.put(192, "Test122");
		map.put(103, "Oak");
		map.put(273, "Joke");
		map.put(633, "Soak");
		map.put(711, "Rock");
		map.put(822, "Mock");
		map.put(252, "Test");
		map.put(1332, "Test122");
		map.put(138, "Oak");
		map.put(2390, "Joke");
		map.put(3377, "3377");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
 	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj.equals(obj);
	}

}
