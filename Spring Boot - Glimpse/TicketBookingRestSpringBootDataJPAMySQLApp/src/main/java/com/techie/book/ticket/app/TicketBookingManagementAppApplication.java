package com.techie.book.ticket.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.techie.book.ticket.entity.Ticket;
import com.techie.book.ticket.service.TicketBookingService;

@SpringBootApplication
@ComponentScan(basePackages={"com.techie.book.ticket.controller","com.techie.book.ticket.service","com.techie.book.ticket.dao"})
@EntityScan("com.techie.book.ticket.entity")
@EnableJpaRepositories("com.techie.book.ticket.dao")
public class TicketBookingManagementAppApplication implements CommandLineRunner{
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
	    ticket.setPassangerName("Naina");
	    ticket.setEmail("naina765@hmail.com");
	    ticket.setBookingDate(new Date());
	    ticket.setSourceStation("Delhi");
	    ticket.setDestStation("Mumbai");
	    ticketBookingService.createTicket(ticket);
	    System.out.println("DataSource :: " + dataSource.toString());
	}

}
