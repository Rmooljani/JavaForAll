package com.techie.basics.multithreading;

import java.util.concurrent.TimeUnit;

public class SecondWayToCreateThread {
	
	public static void main(String[] args) {
		new SecondWay();
		new SecondWay();
	}

}

class SecondWay implements Runnable{

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
	
	public SecondWay() {
		this.id=++count;
		new Thread(this).start();
	}
}