package com.techie.basics.multithreading;

import java.util.concurrent.TimeUnit;

public class NamingThreadFirstWay {
	
	public static void main(String[] args) {
		System.out.println("Main Thread starts here...");
		new Thread(new LoopTasks()).start();
		new Thread(new LoopTasks()).start();
		System.out.println("Main Thread ends here...");
	}

}

/**
 * @author rashmi.mooljani
 *
 */
class LoopTasks implements Runnable{
	
	private static int count = 0;
	private int id;
	
	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName(); 
		for(int i=10;i>0;i--) {
			System.out.println(id + " " + currentThreadName +  "  Tick Tock..." +  i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public LoopTasks() {
		this.id = ++count;
	}
	
}
