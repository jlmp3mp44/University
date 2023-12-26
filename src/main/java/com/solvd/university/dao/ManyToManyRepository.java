package com.solvd.university.dao;

import com.solvd.university.model.Exam;
import com.solvd.university.model.Student;

public interface ManyToManyRepository<T,R> {
    void create(T t, R r);
}
