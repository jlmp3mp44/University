package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.University;

import java.util.List;

public interface UniversityRepository {
    University create(University university);
    University updateById(Long id);
    University deleteById(Long id);
    University findById(Long id);
    List<University> findAll();
}
