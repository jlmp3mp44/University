package com.solvd.university.dao;

import com.solvd.university.model.Professor;

import java.util.List;

public interface ProfessorRepository {
    void create(Professor professor);

    List<Professor> findAll();
}
