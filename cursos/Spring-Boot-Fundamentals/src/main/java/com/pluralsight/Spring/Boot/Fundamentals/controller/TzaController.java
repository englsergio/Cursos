package com.pluralsight.Spring.Boot.Fundamentals.controller;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Application;
import com.pluralsight.Spring.Boot.Fundamentals.entity.Ticket;
import com.pluralsight.Spring.Boot.Fundamentals.service.ApplicationService;
import com.pluralsight.Spring.Boot.Fundamentals.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tza")
public class TzaController {
    private final ApplicationService applicationService;
    private final TicketService ticketService;

    public TzaController(
            ApplicationService applicationService,
            TicketService ticketService) {
        this.applicationService = applicationService;
        this.ticketService = ticketService;
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> list = applicationService.listApplications();
        return new ResponseEntity<List<Application>>(list, HttpStatus.OK);
    }
    @GetMapping("/application/{id}")
    public ResponseEntity<Application> getApplication(
            @PathVariable("id") long id) {
        Application application = applicationService.findApplication(id);
        return new ResponseEntity<>(application, HttpStatus.OK);
    }
    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> list = ticketService.listTickets();
        return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
    }
}
