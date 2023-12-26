package com.solvd.university.service.impl;

import com.solvd.university.dao.AssessmentRepository;
import com.solvd.university.dao.impl.ExamRepositoryImpl;
import com.solvd.university.model.Exam;
import com.solvd.university.service.AssesstmentService;

public class ExamServiceImpl implements AssesstmentService<Exam> {
    private final AssessmentRepository examRepository;

    public ExamServiceImpl() {
        this.examRepository = new ExamRepositoryImpl();
    }

    public void create(Exam exam) {
        exam.setId(null);
        examRepository.create(exam);
    }

    public Exam findById(Long examId) {
        Exam exam = (Exam) examRepository.findById(examId);
        return exam;
    }
}
