package com.solvd.university.service.impl;

import com.solvd.university.dao.EducationalRepository;
import com.solvd.university.dao.impl.SpecialityRepositoryImpl;
import com.solvd.university.model.Speciality;
import com.solvd.university.service.EducationalService;

public class SpecialityServiceImpl implements EducationalService<Speciality> {
    private EducationalRepository specialityRepository;

    public SpecialityServiceImpl() {
        this.specialityRepository = new SpecialityRepositoryImpl();
    }

    public void create(Speciality speciality) {
        speciality.setId(null);
        specialityRepository.create(speciality);
    }

    public void update(Speciality speciality) {
        specialityRepository.update(speciality);
    }
}
