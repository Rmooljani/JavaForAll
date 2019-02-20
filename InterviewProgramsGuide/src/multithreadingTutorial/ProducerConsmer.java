package com.iris.multithreading.tutorial;

import java.util.Scanner;

public class ProducerConsmer{

	public static void main(String[] args) throws InterruptedException {
		
		final ProdConsumer pc = new ProdConsumer();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}); 	
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}

class ProdConsumer {
	
	public void produce() throws InterruptedException {
		synchronized (this) {
			Thread.sleep(100);
			try {
				System.out.println("producer thread running...");
				wait();
				System.out.println("Resumed"); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void consume() throws InterruptedException {
		Thread.sleep(100);
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("consumer thread running....");
		synchronized (this) {
			System.out.println("Waiting for return key."); 
			s.nextLine();
			System.out.println("Return key pressed"); 
			notify();
			Thread.sleep(200); 
		}
	}
}


