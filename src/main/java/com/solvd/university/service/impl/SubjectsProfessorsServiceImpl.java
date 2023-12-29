package com.solvd.university.service.impl;

import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.dao.impl.jdbc.SubjectsProfessorsRepositoryImpl;
import com.solvd.university.dao.impl.myBatis.SubjectsProfessorsRepositoryMyBatisImpl;
import com.solvd.university.model.Professor;
import com.solvd.university.model.Subject;
import com.solvd.university.service.ManyToManyService;

public class SubjectsProfessorsServiceImpl implements ManyToManyService<Subject, Professor> {
    private final ManyToManyRepository subjectsProfessorsRepository;

    public SubjectsProfessorsServiceImpl() {
        this.subjectsProfessorsRepository =  new SubjectsProfessorsRepositoryMyBatisImpl();
    }
    @Override
    public void create(Subject subject, Professor professor) {
        subjectsProfessorsRepository.create(subject, professor);
    }
}

