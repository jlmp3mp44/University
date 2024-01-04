package com.solvd.university.dao;

import com.solvd.university.model.Faculty;

import java.util.List;

public interface FacultyRepository {
    void create(Faculty faculty);

    List<Faculty> findAll();
}
