package com.solvd.university.service;

public interface MedicalService<T> {
    void create(T t);

    default void update(T t) {
        return;
    }

    default T findById(Long id) {
        return null;
    }
}
