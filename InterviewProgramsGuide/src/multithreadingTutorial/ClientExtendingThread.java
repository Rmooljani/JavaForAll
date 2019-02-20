package com.iris.multithreading.tutorial;

public class ClientExtendingThread {
	
	public static void main(String[] args) {
		
		ThreadByExtendingThread byExtendingThread1 = new ThreadByExtendingThread();
		ThreadByExtendingThread byExtendingThread2 = new ThreadByExtendingThread();
		byExtendingThread1.start();
		byExtendingThread2.start();
		
	}

}
