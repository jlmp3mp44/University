package com.solvd.university.dao;

import java.util.ArrayList;
import java.util.List;

public interface EducationalRepository<T>{
    void create(T t);

    default List<T> findAll(){
        List<T> list =  new ArrayList<>();
        return null;
    }

    default void delete(T t ){
        return;
    }
    default void update(T t){
        return;
    }
}
