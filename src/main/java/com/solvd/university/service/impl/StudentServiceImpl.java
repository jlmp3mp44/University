package com.solvd.university.service.impl;

import com.solvd.university.dao.StudentRepository;
import com.solvd.university.dao.impl.StudentRepositoryImpl;
import com.solvd.university.model.Student;
import com.solvd.university.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl() {
        this.studentRepository = new StudentRepositoryImpl();
    }

    public void create(Student student) {
        student.setId(null);
        studentRepository.create(student);
    }

    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
