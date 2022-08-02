package com.pluralsight.Spring.Boot.Fundamentals.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class PeopleHealthIndicator implements HealthIndicator {
    private final String message_key = "PeopleService";

    public Health health() {
        if (!isRunningServicePeopleService()) {
            return Health.down().withDetail(message_key, "Not Available").build();
        }
        return Health.up().withDetail(message_key, "Available").build();
    }

    private Boolean isRunningServicePeopleService() {
        Boolean isRunning = false;
        //Add real logic here to test if PeopleService is running;
        //Skipped for demo purposes.
        return isRunning;
    }
}
