package com.solvd.university.service;

public interface AssesstmentService<T> {
    void create(T t);

    T findById(Long id);
}
