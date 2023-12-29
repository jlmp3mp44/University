package com.solvd.university.dao;


import java.util.List;
import java.util.Optional;


public interface PersonRepository <T>{
    void create(T t);

    void delete(T t);

    List<Optional<T>> findAll();

}
