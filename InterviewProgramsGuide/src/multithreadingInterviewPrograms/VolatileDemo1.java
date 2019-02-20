package com.iris.interview.programs.multithreading;

public class VolatileDemo1 {
	
	static volatile int x=0,y=0;
	
	/*static synchronized void method1() {
		x++;
		y++;
	}

    static synchronized void method2() {
    	System.out.println("x=" +x + " y=" +y);
    }*/
	
	static  void method1() {
		x++;
		y++;
	}

    static  void method2() {
    	System.out.println("x=" +x + " y=" +y);
    }
    
    public static void main(String[] args) {
		Thread thread1 = new Thread() {
			public void run() {
			 for(int i = 1; i<5;i++) {
				 method1();
				 System.out.println("i=" +i + " Thread name=" + Thread.currentThread().getName());
			 }
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
			 for(int i = 1; i<5;i++) {
				 method2();
			 }
			}
		};
		
		thread1.start();
		thread2.start();
	}
}
