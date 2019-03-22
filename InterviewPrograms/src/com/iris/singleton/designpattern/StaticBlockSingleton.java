package com.iris.singleton.designpattern;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton singleton = null;
	
	private StaticBlockSingleton() {
		
	}
	
	static {
		try {
			singleton = new StaticBlockSingleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		
		return singleton;
		
	}

}
