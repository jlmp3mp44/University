package com.solvd.university.service;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Faculty;
import com.solvd.university.model.Speciality;

import java.util.List;

public interface EducationalService <T>{
    void create(T t);

    default List<T> findAll(){return  null;}

    default void update(T t){return;}

    default void delete(T t){return;}
}
