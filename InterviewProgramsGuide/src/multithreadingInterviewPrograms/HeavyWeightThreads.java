package com.iris.interview.programs.multithreading;


class MyThread1 implements Runnable{
	@Override
	public void run() {
		
		for(int i=0;i<=4;i++) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("i= " +i + " ,Thread name=" + Thread.currentThread().getName() );
	}
}}
	
class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=4;i++) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("i= " +i + " ,Thread name=" + Thread.currentThread().getName() );
	}
}}
	
public class HeavyWeightThreads {
   public static void main(String[] args) {
	   MyThread1 t1 = new MyThread1();
	   MyThread2 t2 = new MyThread2();
	   Thread thread1 = new Thread(t1,"Thread-1");
	   Thread thread2 = new Thread(t2,"Thread-2");
	   thread1.start();
	   thread2.start();
   }
  }
