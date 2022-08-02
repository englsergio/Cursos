//package com.pluralsight.Spring.Boot.Fundamentals.resolver;
//
//import com.pluralsight.Spring.Boot.Fundamentals.entity.Application;
//import com.pluralsight.Spring.Boot.Fundamentals.repository.ApplicationRepository;
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Query implements GraphQLQueryResolver {
//    private ApplicationRepository applicationRepository;
//
//    public Query(ApplicationRepository applicationRepository) {
//        this.applicationRepository = applicationRepository;
//    }
//
//    public Iterable<Application> findAllApplications() {
//        return applicationRepository.findAll();
//    }
//
//    public Long countApplications() {
//        return applicationRepository.count();
//    }
//}
