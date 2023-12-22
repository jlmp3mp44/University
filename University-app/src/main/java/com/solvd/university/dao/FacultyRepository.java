package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Faculty;

import java.util.List;

public interface FacultyRepository {
    Faculty create(Faculty faculty);
    Faculty updateById(Long id);
    Faculty deleteById(Long id);
    Faculty findById(Long id);
    List<Faculty> findAll();
}
