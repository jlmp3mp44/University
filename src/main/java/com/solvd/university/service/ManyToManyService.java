package com.solvd.university.service;

import com.solvd.university.model.Exam;
import com.solvd.university.model.Student;

public interface ManyToManyService<T, R> {
    void create(T t, R r);
}
