package com.techie.basics.multithreading;

import java.util.concurrent.TimeUnit;

public class FourthWayToCreateThread {
	
	public static void main(String[] args) {
		
		new Thread(new FourthWay()).start();
		new Thread(new FourthWay()).start();
	}

}

class FourthWay implements Runnable{

	private static int count=0;
	private int id;
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(id + " Tick Tock..." + i);
		}
		
		try {
			TimeUnit.MILLISECONDS.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public FourthWay() {
		this.id=++count;
		
	}
}