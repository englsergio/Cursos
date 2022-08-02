package com.pluralsight.Spring.Boot.Fundamentals.controller;

import com.pluralsight.Spring.Boot.Fundamentals.service.ApplicationService;
import com.pluralsight.Spring.Boot.Fundamentals.service.TicketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(TzaController.class)
public class TzaControllerUnitTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ApplicationService applicationService;

    @MockBean
    TicketService ticketService;

    @Test
    public void getAllApplications() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/tza/applications/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
        Mockito.verify(applicationService, Mockito.times(1)).listApplications();
    }
    @Test
    public void getAllTickets() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/tza/tickets/"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));

        Mockito.verify(ticketService, Mockito.times(1)).listTickets();
    }
}
