package com.pluralsight.Spring.Boot.Fundamentals.repository;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Integer> {
}
