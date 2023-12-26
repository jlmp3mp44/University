package com.solvd.university.service.impl;

import com.solvd.university.dao.EducationalRepository;
import com.solvd.university.dao.impl.CafedraRepositoryImpl;
import com.solvd.university.model.Cafedra;
import com.solvd.university.service.EducationalService;

public class CafedraServiceImpl implements EducationalService<Cafedra> {

    private final EducationalRepository cafedraRepository;

    public CafedraServiceImpl() {
        this.cafedraRepository = new CafedraRepositoryImpl();
    }

    public void create(Cafedra cafedra) {
        cafedra.setId(null);
        cafedraRepository.create(cafedra);
    }

    public void delete(Cafedra cafedra) {
        cafedraRepository.delete(cafedra);
    }

}
