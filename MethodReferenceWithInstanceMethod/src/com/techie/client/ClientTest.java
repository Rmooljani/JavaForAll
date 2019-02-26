package com.techie.client;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Alisha");
		names.add("Christina");
		names.add("Maria");
		names.add("Rosy");
		
		System.out.println("=====//1st way to print elements======");
		names.forEach(System.out::println);
		System.out.println("=====//2nd way to print elements======");
		names.forEach(x->System.out.println(x));
		
	}

}
