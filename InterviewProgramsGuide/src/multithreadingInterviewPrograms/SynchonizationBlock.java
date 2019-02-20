package com.iris.interview.programs.multithreading;

class MyThreadClass implements Runnable{
	@Override
	public void run() {
		System.out.println(" Thread name=" + Thread.currentThread().getName() + " waiting for lock");
		synchronized (this) {
			try {
				System.out.println(" Thread name=" + Thread.currentThread().getName() + " acquired lock");
				Thread.sleep(100);
			}catch(InterruptedException e){
			    e.printStackTrace();	
			}
			System.out.println(" Thread name=" + Thread.currentThread().getName() + " released lock & ended");
		}
		
	}
	
}
public class SynchonizationBlock {
	public static void main(String[] args) {
		MyThreadClass mt = new MyThreadClass();
		Thread t = new Thread(mt);
		MyThreadClass mt1 = new MyThreadClass();
		Thread t1 = new Thread(mt1);
		t.start();
		t1.start();
	}
}
