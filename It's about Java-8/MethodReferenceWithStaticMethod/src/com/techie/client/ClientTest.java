package com.techie.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable command = ClientTest::myRun;// reference to a static method - lambda 
	    executorService.execute(command);
		
	}
	
	private static void myRun() {
		System.out.println("My task is running...");
	}

}
