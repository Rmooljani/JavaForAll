package com.iris.singleton.designpattern;

public class ThreadSafeSingleton {
	
private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton () {
		
	}
	
	public static synchronized ThreadSafeSingleton  getInstance() {
		
		if(threadSafeSingleton==null) {
			threadSafeSingleton = new ThreadSafeSingleton();
		}
		return threadSafeSingleton;
	}
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		
		if(threadSafeSingleton==null) {
			synchronized (ThreadSafeSingleton.class) {
				if(threadSafeSingleton!=null) {
					threadSafeSingleton = new ThreadSafeSingleton();
				}
				
			}
		} return threadSafeSingleton;
	}

}
