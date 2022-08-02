package com.pluralsight.Spring.Boot.Fundamentals.service;

import com.pluralsight.Spring.Boot.Fundamentals.entity.Release;

import java.util.List;

public interface ReleaseService {
    List<Release> listReleases();
}
