package com.techie.basics.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i=10;i>0;i--) {
		executorService.submit(new Task(i));
		}
	}

}
class Task implements Runnable{
	
	private int taskId;;

	@Override
	public void run() {
	
			System.out.println("Task Id " + taskId + " performed by " + Thread.currentThread().getName());
		}
	
	Task(int id){
		this.taskId = id;
	}
	
}
