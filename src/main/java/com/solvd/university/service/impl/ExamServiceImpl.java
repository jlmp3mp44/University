package com.solvd.university.service.impl;

import com.solvd.university.dao.ExamRepository;
import com.solvd.university.dao.impl.myBatis.ExamRepositoryMyBatisImpl;
import com.solvd.university.model.Exam;
import com.solvd.university.service.AssesstmentService;

public class ExamServiceImpl implements AssesstmentService<Exam> {
    private final ExamRepository examRepository;

    public ExamServiceImpl() {
        this.examRepository = new ExamRepositoryMyBatisImpl();
    }

    public void create(Exam exam) {
        if (exam.getTitle() != null) {
            exam.setId(null);
            examRepository.create(exam);
        }
    }

    public Exam findById(Long examId) {
        Exam exam = (Exam) examRepository.findById(examId);
        return exam;
    }
}
