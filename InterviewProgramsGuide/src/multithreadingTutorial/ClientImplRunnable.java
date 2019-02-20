package com.iris.multithreading.tutorial;

public class ClientImplRunnable {
	
	public static void main(String[] args) {
		ThreadByImplRunnable byImplRunnable1 = new ThreadByImplRunnable();
		Thread thread1 = new Thread(byImplRunnable1,"Thread-1");
		Thread thread2 = new Thread(byImplRunnable1,"Thread-2");
		
		thread1.start();
		thread2.start();
	}

}
