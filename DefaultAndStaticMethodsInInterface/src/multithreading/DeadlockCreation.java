package com.iris.interview.programs.multithreading;

class A implements Runnable{
    public void run() {
           
           synchronized (String.class) {
                  System.out.println(Thread.currentThread().getName() + "has acquired lock "
                            + "on String class and waiting to acquire lock on Object class...");
                  synchronized (Object.class) {
                        System.out.println(Thread.currentThread().getName() +
                                      " has acquired lock on Object class");
                  }
           }
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 
class B extends Thread{
    public void run() {
           
           synchronized (Object.class) {  
                  System.out.println(Thread.currentThread().getName() + " has acquired "
                      + "lock on Object class and waiting to acquire lock on String class...");
                  synchronized (String.class) {
                        System.out.println(Thread.currentThread().getName() +
                                      " has acquired lock on String class");
                  }
           }
           System.out.println(Thread.currentThread().getName()+ " has ENDED");
    }
}
 
public class DeadlockCreation {
 
    public static void main(String[] args) throws InterruptedException {
           Thread thread1 = new Thread(new A(), "Thread-1");
           Thread thread2 = new Thread(new B(), "Thread-2");
           thread1.start();
           thread1.join();
           thread2.start();
    }
 
}