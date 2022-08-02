package com.pluralsight.Spring.Boot.Fundamentals.service;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Application;
import com.pluralsight.Spring.Boot.Fundamentals.exception.ApplicationNotfoundException;
import com.pluralsight.Spring.Boot.Fundamentals.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService{
    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public List<Application> listApplications() {
        return (List<Application>) applicationRepository.findAll();
    }

    @Override
    public Application findApplication(Long id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);

        if(optionalApplication.isPresent()) return optionalApplication.get();
        throw new ApplicationNotfoundException("Application Not Found");
    }
}
