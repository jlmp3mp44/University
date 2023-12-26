package com.solvd.university.dao;

import com.solvd.university.model.Student;

public interface StudentRepository {
    void create(Student student);

    void delete(Student student);
}
