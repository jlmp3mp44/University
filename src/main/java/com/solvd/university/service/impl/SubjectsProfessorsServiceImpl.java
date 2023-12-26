package com.solvd.university.service.impl;

import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.dao.impl.StudentsExamsRepositoryImpl;
import com.solvd.university.dao.impl.SubjectsProfessorsRepositoryImpl;
import com.solvd.university.model.Exam;
import com.solvd.university.model.Professor;
import com.solvd.university.model.Student;
import com.solvd.university.model.Subject;
import com.solvd.university.service.ManyToManyService;

public class SubjectsProfessorsServiceImpl implements ManyToManyService<Subject, Professor> {
    private final ManyToManyRepository subjectsProfessorsRepository;

    public SubjectsProfessorsServiceImpl() {
        this.subjectsProfessorsRepository =  new SubjectsProfessorsRepositoryImpl();
    }
    @Override
    public void create(Subject subject, Professor professor) {
        subjectsProfessorsRepository.create(subject, professor);
    }
}

