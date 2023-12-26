package com.solvd.university.service.impl;

import com.solvd.university.dao.CafedraRepository;
import com.solvd.university.dao.impl.CafedraRepositoryImpl;
import com.solvd.university.model.Cafedra;
import com.solvd.university.service.CafedraService;

public class CafedraServiceImpl implements CafedraService {

    private final CafedraRepository cafedraRepository;

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
