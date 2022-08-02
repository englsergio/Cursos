package com.pluralsight.Spring.Boot.Fundamentals.service;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> listTickets();
}
