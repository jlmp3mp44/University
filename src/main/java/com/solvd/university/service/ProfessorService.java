package com.solvd.university.service;

import com.solvd.university.model.Professor;

import java.util.List;

public interface ProfessorService {
    void create(Professor professor);

    List<Professor> findAll();
}
