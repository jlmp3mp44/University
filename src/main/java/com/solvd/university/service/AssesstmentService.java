package com.solvd.university.service;

import com.solvd.university.model.Exam;

public interface AssesstmentService <T>{
    void create(T t);

    T findById(Long id);
}
