package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Professor;

import java.util.List;

public interface ProfessorRepository {
    Professor create(Professor professor);
    Professor updateById(Long id);
    Professor deleteById(Long id);
    Professor findById(Long id);
    List<Professor> findAll();
}
