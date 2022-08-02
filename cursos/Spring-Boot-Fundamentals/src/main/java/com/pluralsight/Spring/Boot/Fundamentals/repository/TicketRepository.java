package com.pluralsight.Spring.Boot.Fundamentals.repository;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
