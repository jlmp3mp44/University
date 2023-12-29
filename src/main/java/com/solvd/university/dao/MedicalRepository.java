package com.solvd.university.dao;

public interface MedicalRepository <T>{
    void create(T t);

   default void update(T t){
       return;
   }

    default T findById(Long id){
        return null;
    }
}
