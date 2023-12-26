package com.solvd.university.service;

import com.solvd.university.model.Subject;

public interface SubjectService {
    void create(Subject subject);

    Subject findById(Long subjectId);
}
