package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Speciality;

import java.util.List;

public interface StudentRepository {
    Speciality create(Speciality speciality);
    Speciality updateById(Long id);
    Speciality deleteById(Long id);
    Speciality findById(Long id);
    List<Speciality> findAll();
}
