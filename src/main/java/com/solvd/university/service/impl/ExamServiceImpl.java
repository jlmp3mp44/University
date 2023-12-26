package com.solvd.university.service.impl;

import com.solvd.university.dao.ExamRepository;
import com.solvd.university.dao.impl.ExamRepositoryImpl;
import com.solvd.university.model.Exam;
import com.solvd.university.service.ExamService;

public class ExamServiceImpl implements ExamService {
    private final ExamRepository examRepository;

    public ExamServiceImpl() {
        this.examRepository = new ExamRepositoryImpl();
    }

    public void create(Exam exam) {
        exam.setId(null);
        examRepository.create(exam);
    }

    public Exam findById(Long examId) {
        Exam exam = examRepository.findById(examId);
        return exam;
    }
}
