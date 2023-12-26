package com.solvd.university.service.impl;

import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.dao.impl.SubjectSpecialityRepositoryImpl;
import com.solvd.university.model.Speciality;
import com.solvd.university.model.Subject;
import com.solvd.university.service.ManyToManyService;

public class SubjectSpecialityServiceImpl implements ManyToManyService<Speciality, Subject> {
    private final ManyToManyRepository subjectsSpecialitiesRepository;

    public SubjectSpecialityServiceImpl() {
        this.subjectsSpecialitiesRepository =  new SubjectSpecialityRepositoryImpl();
    }
    @Override
    public void create(Speciality speciality, Subject subject) {
        subjectsSpecialitiesRepository.create(subject, speciality);
    }
}

