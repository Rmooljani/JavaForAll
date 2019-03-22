package com.iris.singleton.designpattern;

public class TestSingletonPattern {
	
	public static void main(String[] args) {
		
		StaticBlockSingleton s = StaticBlockSingleton.getInstance();
		StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
		System.out.println(s==s1);
	}

}
