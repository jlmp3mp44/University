package com.solvd.university.service;

import com.solvd.university.model.Professor;
import com.solvd.university.model.Student;

import java.util.List;

public interface PersonService <T>{
    void create(T t);

    List<T> findAll();

    void delete(T t);
}
