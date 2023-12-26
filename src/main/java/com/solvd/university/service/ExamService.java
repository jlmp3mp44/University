package com.solvd.university.service;

import com.solvd.university.model.Exam;

public interface ExamService {
    void create(Exam exam);

    Exam findById(Long examId);
}
