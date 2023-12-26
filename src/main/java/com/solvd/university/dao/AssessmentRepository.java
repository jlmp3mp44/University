package com.solvd.university.dao;



public interface AssessmentRepository<T>{
    void create(T t);

    T findById(Long id);
}
