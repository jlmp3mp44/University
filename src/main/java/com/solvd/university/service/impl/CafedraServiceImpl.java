package com.solvd.university.service.impl;

import com.solvd.university.dao.EducationalRepository;
import com.solvd.university.dao.impl.jdbc.CafedraRepositoryImpl;
import com.solvd.university.dao.impl.myBatis.CafedraRepositoryMyBatisImpl;
import com.solvd.university.model.Cafedra;
import com.solvd.university.service.EducationalService;

public class CafedraServiceImpl implements EducationalService<Cafedra> {

    private final EducationalRepository cafedraRepository;

    public CafedraServiceImpl() {
        this.cafedraRepository = new CafedraRepositoryMyBatisImpl();
    }

    public void create(Cafedra cafedra) {
        if(cafedra.getTitle()!=null) {
            cafedra.setId(null);
            cafedraRepository.create(cafedra);
        }
    }

    public void delete(Cafedra cafedra) {
        cafedraRepository.delete(cafedra);
    }

}
