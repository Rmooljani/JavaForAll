package com.techie.basics.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	
	private static int nThreads = 2;
	private static int nTasks=10;
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
		 System.out.println("executor created with 2 threads.");
         
         System.out.println("2 threads in executor will be used for executing 10 tasks. "
                      + "So, at a time only 2 tasks will be executed");
         
         for(int i=0;i<nTasks;i++) {
        	 MyRunnable myRunnable = new MyRunnable(i);
        	 executorService.execute(myRunnable);
         }
         
         executorService.shutdown();
         System.out.println("Executor has been shut down......");
	}

}

class MyRunnable implements Runnable{
	int taskNumber;
	
	public MyRunnable(int taskNumber) {
		this.taskNumber=taskNumber;
	}
	

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Executor run method ...");
			System.out.println(Thread.currentThread().getName() + " " +  taskNumber);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}