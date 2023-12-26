package com.solvd.university.service.impl;

import com.solvd.university.dao.ProfessorRepository;
import com.solvd.university.dao.impl.ProfessorRepositoryImpl;
import com.solvd.university.model.Professor;
import com.solvd.university.service.ProfessorService;

import java.util.List;

public class ProfessorServiceImpl implements ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorServiceImpl() {
        this.professorRepository = new ProfessorRepositoryImpl();
    }

    public void create(Professor professor) {
        professor.setId(null);
        professorRepository.create(professor);
    }

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }
}
