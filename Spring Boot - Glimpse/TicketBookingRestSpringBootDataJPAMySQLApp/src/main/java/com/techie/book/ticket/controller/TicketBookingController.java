package com.techie.book.ticket.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techie.book.ticket.entity.Ticket;
import com.techie.book.ticket.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketBookingService; 
	
	@PostMapping(value="/createTicket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

	@GetMapping(value="/getTicket/{ticketId}")
//	@RequestMapping(value="/getTicket/{ticketId}",method=RequestMethod.GET)
	public Optional<Ticket> getTicketById(@PathVariable("ticketId")Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}
	
	@GetMapping(value="/getTicket/allTickets")
	public Iterable<Ticket> getAllBookedTickets(){
		return ticketBookingService.getAllBookedTickets();
	}
	
	@DeleteMapping(value="/deleteTicket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId) {
		ticketBookingService.deleteTicket(ticketId);
	}
	
	//@RequestMapping(value="/updateTicket",method=RequestMethod.PUT)
	@PutMapping(value="/ticket/updateTicket/{ticketId}/{new Email:.+}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("new Email") String newEmail) {
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}
}
