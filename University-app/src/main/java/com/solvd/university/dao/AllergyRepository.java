package com.solvd.university.dao;

import com.solvd.university.model.Allergy;

import java.sql.ClientInfoStatus;
import java.util.List;

public interface AllergyRepository  {
    Allergy create(Allergy allergy);
    Allergy updateById(Long id);
    void  deleteById(Long id);
    Allergy findById(Long id);
    List<Allergy> findAll();
}
