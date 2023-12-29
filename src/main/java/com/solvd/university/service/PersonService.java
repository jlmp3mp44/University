package com.solvd.university.service;

import com.solvd.university.model.Student;

import java.util.List;
import java.util.Optional;

public interface PersonService <T>{
    void create(T t);

    List<Optional<Student>> findAll();

    void delete(T t);
}
