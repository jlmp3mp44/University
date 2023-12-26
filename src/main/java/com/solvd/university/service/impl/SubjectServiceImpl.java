package com.solvd.university.service.impl;

import com.solvd.university.dao.AssessmentRepository;
import com.solvd.university.dao.impl.SubjectRepositoryImpl;
import com.solvd.university.model.Subject;
import com.solvd.university.service.AssesstmentService;

public class SubjectServiceImpl implements AssesstmentService<Subject> {
    private final AssessmentRepository subjectRepository;

    public SubjectServiceImpl() {
        this.subjectRepository = new SubjectRepositoryImpl();
    }

    public void create(Subject subject) {
        if(subject.getTitle()!=null) {
            subject.setId(null);
            subjectRepository.create(subject);
        }
    }

    public Subject findById(Long id) {
        return (Subject) subjectRepository.findById(id);
    }
}
