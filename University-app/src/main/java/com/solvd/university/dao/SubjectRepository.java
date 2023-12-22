package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Subject;

import java.util.List;

public interface SubjectRepository {
    Subject create(Subject subject);
    Subject updateById(Long id);
    Subject deleteById(Long id);
    Subject findById(Long id);
    List<Subject> findAll();
}
