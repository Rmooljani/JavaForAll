package com.iris.interview.programs.multithreading;

class MyRunnable2 implements Runnable{
    public void run(){   //overrides Runnable's run() method
           System.out.println("in run() method");
           System.out.println("currentThreadName in child= "+ Thread.currentThread().getName());
    }
}
public class ThreadOwnStack {
    public static void main(String args[]){
    	System.out.println("in main() method");
    	run();
           MyRunnable2 runnable=new MyRunnable2();
           System.out.println("currentThreadName in main1= "+ Thread.currentThread().getName());
           Thread thread=new Thread(runnable);
           thread.start();
    }
    
    public static void run(){   //overrides Runnable's run() method
        System.out.println("in run() main() method");
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread t1 = new Thread(myRunnable2);
        t1.start();
        System.out.println("currentThreadName in main2= "+ Thread.currentThread().getName());
 }
}