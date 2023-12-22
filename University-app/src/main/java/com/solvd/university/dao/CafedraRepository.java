package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;

import java.util.List;

public interface CafedraRepository {
    Cafedra create(Cafedra cafedra);
    Cafedra updateById(Long id);
    Cafedra deleteById(Long id);
    Cafedra findById(Long id);
    List<Cafedra> findAll();
}
