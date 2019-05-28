package com.techie.basics.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo implements Runnable{
	
	private CountDownLatch latch=null;

	public CountDownLatchDemo(CountDownLatch latch) {
		this.latch=latch;
	}

	@Override
	public void run(){
		
		try {
			Thread.sleep(1000);
			this.latch.countDown();
			
			Thread.sleep(1000);
			this.latch.countDown();
			
			Thread.sleep(1000);
			this.latch.countDown();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Waiter Released");
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new  CountDownLatch(5);
		CountDownLatchDemo demo = new CountDownLatchDemo(countDownLatch);
		
		new Thread(demo).start();
		
		Thread.sleep(1000);
	}
	
}

