package com.techie.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.techie.book.ticket.entity.Ticket;
import com.techie.book.ticket.service.TicketBookingService;

@SpringBootApplication
@ComponentScan(basePackages={"com.techie.book.ticket.controller","com.techie.book.ticket.service","com.techie.book.ticket.dao"})
@EntityScan("com.techie.book.ticket.entity")
@EnableJpaRepositories("com.techie.book.ticket.dao")
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	    TicketBookingService bookingService = applicationContext.getBean("ticketBookingService",TicketBookingService.class);
	    Ticket ticket = new Ticket();
	    ticket.setPassangerName("Max");
	    ticket.setEmail("max123@hmail.com");
	    ticket.setBookingDate(new Date());
	    ticket.setSourceStation("Mumbai");
	    ticket.setDestStation("Chennai");
	    bookingService.createTicket(ticket);
	
	}

}
