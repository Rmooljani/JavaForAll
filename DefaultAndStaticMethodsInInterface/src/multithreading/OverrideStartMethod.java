package com.iris.interview.programs.multithreading;

class Mthread extends Thread{
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("i= " + i + " ,Thread name =" + Thread.currentThread().getName());
		}
	}
	
	/*@Override
	public  void start() {
		System.out.println("in start method...");
	}*/
}
public class OverrideStartMethod {
	
	public static void main(String[] args) {
		System.out.println("main method started ...");
		Mthread mt = new Mthread();
		mt.start();
		//mt.run();
		System.out.println("main method ended ...");
	}

}
