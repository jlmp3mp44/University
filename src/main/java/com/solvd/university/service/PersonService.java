package com.solvd.university.service;

import java.util.List;
import java.util.Optional;

public interface PersonService<T> {
    void create(T t);

    List<Optional<T>> findAll();

    void delete(T t);
}
