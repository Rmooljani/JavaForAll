package com.iris.interview.programs.multithreading;

class BookingTicket implements Runnable{
	int ticketsAvailable =1;


	public void run() {
		System.out.println("currently available tickets :" + ticketsAvailable);
		System.out.println("Waiting to book ticket for :" +Thread.currentThread().getName());
		synchronized(this) {
		if(ticketsAvailable>0) {
			System.out.println("Booking tickets for :" + Thread.currentThread().getName());
		try {
		 Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		ticketsAvailable--;
		System.out.println("tickets booked for: " +Thread.currentThread().getName());
		System.out.println("currently available tickets :" + ticketsAvailable);
		}else {
			System.out.println("Tickets not booked for :" +Thread.currentThread().getName());
		}
	}}
}


public class TicketBookingRaceCondition {

	public static void main(String[] args) {
		BookingTicket tb = new BookingTicket();
		Thread t = new Thread(tb);
		t.start();
		
		Thread t1 = new Thread(tb);
		t1.start();
	}
}
