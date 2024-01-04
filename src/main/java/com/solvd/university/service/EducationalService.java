package com.solvd.university.service;

import java.util.List;

public interface EducationalService<T> {
    void create(T t);

    default List<T> findAll() {
        return null;
    }

    default void update(T t) {
        return;
    }

    default void delete(T t) {
        return;
    }
}
