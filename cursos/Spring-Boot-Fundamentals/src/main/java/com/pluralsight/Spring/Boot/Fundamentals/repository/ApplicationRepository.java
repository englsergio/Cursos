package com.pluralsight.Spring.Boot.Fundamentals.repository;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
