package com.techie.basics.multithreading;

//Quick & Dirty Technique to create thread
public class FifthWayToCreateThread {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread starts here...");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=10;i>0;i--) {
					System.out.println( " TICK TOCK..." + i);
				}
			}
		}).start();
		
		
		System.out.println("Main Thread ends here...");
	}

}

