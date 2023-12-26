package com.solvd.university.service.impl;

import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.dao.impl.StudentsExamsRepositoryImpl;
import com.solvd.university.model.Exam;
import com.solvd.university.model.Student;
import com.solvd.university.service.ManyToManyService;

public class StudentsExamsServiceImpl implements ManyToManyService<Student, Exam> {
    private final ManyToManyRepository studentsExamsRepository;

    public StudentsExamsServiceImpl() {
        this.studentsExamsRepository = new StudentsExamsRepositoryImpl();
    }
    @Override
    public void create(Student student, Exam exam) {
        studentsExamsRepository.create(student, exam);
    }
}
