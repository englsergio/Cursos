package com.pluralsight.Spring.Boot.Fundamentals.service;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(Long id);
}
