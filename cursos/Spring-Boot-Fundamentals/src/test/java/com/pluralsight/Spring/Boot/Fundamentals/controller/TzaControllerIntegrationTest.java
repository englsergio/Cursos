package com.pluralsight.Spring.Boot.Fundamentals.controller;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TzaControllerIntegrationTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getAllApplications() throws Exception {
        ResponseEntity<List> response =
                this.restTemplate.getForEntity("http://127.0.0.1:" + port + "/tza/applications/", List.class);
        MatcherAssert.assertThat(response.getStatusCode(), CoreMatchers.equalTo(HttpStatus.OK));
    }
    @Test
    public void getAllTickets() throws Exception {
        ResponseEntity<List> response =
                this.restTemplate.getForEntity("http://127.0.0.1:" + port + "/tza/applications/", List.class);
        MatcherAssert.assertThat(response.getStatusCode(), CoreMatchers.equalTo(HttpStatus.OK));
    }
}
