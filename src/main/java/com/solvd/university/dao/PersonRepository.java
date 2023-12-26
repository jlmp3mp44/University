package com.solvd.university.dao;

import com.solvd.university.model.Professor;
import com.solvd.university.model.Student;

import java.util.List;

public interface PersonRepository <T>{
    void create(T t);

    void delete(T t);

    List<T> findAll();

}
