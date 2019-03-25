package com.techie.book.ticket.dao;

import org.springframework.data.repository.CrudRepository;

import com.techie.book.ticket.entity.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {


}
