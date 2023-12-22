package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Vaccine;

import java.util.List;

public interface VaccineRepository {
    Vaccine create(Vaccine vaccine);
    Vaccine updateById(Long id);
    Vaccine deleteById(Long id);
    Vaccine findById(Long id);
    List<Vaccine> findAll();
}
