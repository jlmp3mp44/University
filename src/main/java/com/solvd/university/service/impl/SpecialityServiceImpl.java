package com.solvd.university.service.impl;

import com.solvd.university.dao.SpecialityRepository;
import com.solvd.university.dao.impl.SpecialityRepositoryImpl;
import com.solvd.university.model.Speciality;
import com.solvd.university.service.SpecialityService;

public class SpecialityServiceImpl implements SpecialityService {
    private SpecialityRepository specialityRepository;

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
