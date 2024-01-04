package com.solvd.university.dao;

import com.solvd.university.model.University;

import java.util.List;

public interface UniversityRepository {
    void create(University university);

    List<University> findAll();
}
