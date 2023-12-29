package com.solvd.university.service.impl;

import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.dao.impl.jdbc.SubjectSpecialityRepositoryImpl;
import com.solvd.university.dao.impl.myBatis.SubjectSpecialityRepositoryMyBatisImpl;
import com.solvd.university.model.Speciality;
import com.solvd.university.model.Subject;
import com.solvd.university.service.ManyToManyService;

public class SubjectSpecialityServiceImpl implements ManyToManyService<Speciality, Subject> {
    private final ManyToManyRepository subjectsSpecialitiesRepository;

    public SubjectSpecialityServiceImpl() {
        this.subjectsSpecialitiesRepository =  new SubjectSpecialityRepositoryMyBatisImpl();
    }
    @Override
    public void create(Speciality speciality, Subject subject) {
        subjectsSpecialitiesRepository.create(subject, speciality);
    }
}

