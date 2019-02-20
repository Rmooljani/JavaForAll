package com.iris.interview.programs.multithreading;

public class MyRunnable extends Thread{
	
	@Override
	public void run() {
		super.run();
		for(int i=0;i<=3;i++) {
			System.out.println("Child thread...");
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main thread...");
		
		MyRunnable myRunnable1 = new MyRunnable();
		MyRunnable myRunnable2 = new MyRunnable();
		myRunnable2.start();
		myRunnable1.start();
		
	}

}

