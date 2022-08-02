//package com.pluralsight.Spring.Boot.Fundamentals.mutator;
//
//import com.pluralsight.Spring.Boot.Fundamentals.entity.Application;
//import com.pluralsight.Spring.Boot.Fundamentals.exception.ApplicationNotfoundException;
//import com.pluralsight.Spring.Boot.Fundamentals.repository.ApplicationRepository;
//import graphql.kickstart.tools.GraphQLMutationResolver;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class Mutation implements GraphQLMutationResolver {
//    private final ApplicationRepository applicationRepository;
//
//    public Mutation(ApplicationRepository applicationRepository) {
//        this.applicationRepository = applicationRepository;
//    }
//
//    public Application newApplication(String name,
//                                      String owner,
//                                      String description) {
//        Application app = new Application(name, owner, description);
//        applicationRepository.save(app);
//        return app;
//    }
//
//    public boolean deleteApplication(Long id) {
//        applicationRepository.deleteById(id);
//        return true;
//    }
//
//    public Application updateApplication(String newOwner, Long id) {
//        Optional<Application> optionalApplication = applicationRepository.findById(id);
//        if(optionalApplication.isPresent()) {
//            Application application = optionalApplication.get();
//            application.setOwner(newOwner);
//            applicationRepository.save(application);
//            return application;
//        } else {
//            throw new ApplicationNotfoundException("Application Not Found", id);
//        }
//    }
//}
