package com.pluralsight.Spring.Boot.Fundamentals.service;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Ticket;
import com.pluralsight.Spring.Boot.Fundamentals.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }
}
