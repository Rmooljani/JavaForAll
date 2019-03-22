package com.iris.singleton.designpattern;

public class EagerInitializedSingleton {
	
	private static EagerInitializedSingleton eagerInitializedSingleton =
			new EagerInitializedSingleton();
	
	private EagerInitializedSingleton(){}
	
	public static EagerInitializedSingleton getInstance() {
		return eagerInitializedSingleton;
	}
	
	

}
