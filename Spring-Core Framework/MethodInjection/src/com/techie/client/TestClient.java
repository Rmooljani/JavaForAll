package com.techie.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techie.model.Ticket;
import com.techie.model.TicketVendingMachine;

public class TestClient {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		TicketVendingMachine machine = applicationContext.getBean("ticketVendingMachine" , TicketVendingMachine.class);
		Ticket ticket = machine.generateTicket();
		ticket.printTicket();
		applicationContext.close();
	}

}
