package com.solvd.university.service.impl;

import com.solvd.university.dao.SubjectRepository;
import com.solvd.university.dao.impl.SubjectRepositoryImpl;
import com.solvd.university.model.Subject;
import com.solvd.university.service.SubjectService;

public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl() {
        this.subjectRepository = new SubjectRepositoryImpl();
    }

    public void create(Subject subject) {
        subject.setId(null);
        subjectRepository.create(subject);
    }

    public Subject findById(Long id) {
        return subjectRepository.findById(id);
    }
}
