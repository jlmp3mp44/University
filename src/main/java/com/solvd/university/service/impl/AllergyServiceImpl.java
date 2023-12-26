package com.solvd.university.service.impl;

import com.solvd.university.dao.MedicalRepository;
import com.solvd.university.dao.impl.AllergyRepositoryImpl;
import com.solvd.university.model.Allergy;
import com.solvd.university.service.MedicalService;

public class AllergyServiceImpl implements MedicalService<Allergy> {
    private final MedicalRepository allergyRepository;

    public AllergyServiceImpl() {
        this.allergyRepository = new AllergyRepositoryImpl();
    }

    public void create(Allergy allergy) {
        allergy.setId(null);
        allergyRepository.create(allergy);
    }

    public void update(Allergy allergy) {
        allergyRepository.update(allergy);
    }

}
