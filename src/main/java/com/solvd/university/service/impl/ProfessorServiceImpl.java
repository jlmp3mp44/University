package com.solvd.university.service.impl;

import com.solvd.university.dao.PersonRepository;
import com.solvd.university.dao.impl.ProfessorRepositoryImpl;
import com.solvd.university.model.Professor;
import com.solvd.university.service.PersonService;

import java.util.List;

public class ProfessorServiceImpl implements PersonService<Professor> {
    private final PersonRepository professorRepository;

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
    public void delete(Professor professor){
        professorRepository.delete(professor);
    }
}
