package com.techie.basics.multithreading;

import java.util.concurrent.TimeUnit;

public class FirstWayToCreateThread {
	
	public static void main(String[] args) {
		System.out.println("Main Thread starts here....");
		new FirstClass();
		Thread t = new FirstClass();
		System.out.println("Main Thread ends here....");
	}

}

/**
 * @author rashmi.mooljani
 *
 */
class FirstClass extends Thread{
	
	private static int count = 0;
	private int id;
	
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(id + "  Tick Tock..." +  i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public FirstClass() {
		this.id = ++count;
		this.start();
	}
	
}
