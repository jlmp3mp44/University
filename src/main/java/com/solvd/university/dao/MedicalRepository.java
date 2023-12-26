package com.solvd.university.dao;

import com.solvd.university.model.Allergy;
import com.solvd.university.model.HealthRecord;

public interface MedicalRepository <T>{
    void create(T t);

   default void update(T t){
       return;
   }

    default T findById(Long id){
        return null;
    }
}
