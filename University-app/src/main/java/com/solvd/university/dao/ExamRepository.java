package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Exam;

import java.util.List;

public interface ExamRepository {
    Exam create(Exam exam);
    Exam updateById(Long id);
    Exam deleteById(Long id);
    Exam findById(Long id);
    List<Exam> findAll();
}
