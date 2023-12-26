package com.solvd.university.service;

import com.solvd.university.model.University;

import java.util.List;

public interface UniversityService {
    void create(University university);

    List<University> findAll();
}
