package com.pluralsight.Spring.Boot.Fundamentals;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Application;
import com.pluralsight.Spring.Boot.Fundamentals.repository.ApplicationRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootFundamentalsApplication {
//	private static final Logger log = (Logger) LoggerFactory.getLogger(SpringBootFundamentalsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFundamentalsApplication.class, args);}

//	@Bean
//	public CommandLineRunner demo(ApplicationRepository repository) {
//		return (args) -> {
//			repository.save(new Application("Trackzilla", "kesha.williams", "abc"));
//			repository.save(new Application("Expenses", "mary.jones", "def"));
//			repository.save(new Application("Notifications", "karen.kane", "hgi"));

//			for(Application application : repository.findAll()) {
//				log.info("The application is: " + application.toString());
//			}
//		};
//	}
}
