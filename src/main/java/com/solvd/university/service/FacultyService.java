package com.solvd.university.service;

import com.solvd.university.model.Faculty;

import java.util.List;

public interface FacultyService {
    void create(Faculty faculty);

    List<Faculty> findAll();
}
