package com.solvd.university.service.impl;

import com.solvd.university.dao.AllergyRepository;
import com.solvd.university.dao.impl.AllergyRepositoryImpl;
import com.solvd.university.model.Allergy;
import com.solvd.university.service.AllergyService;
import com.solvd.university.service.HealthRecordService;

public class AllergyServiceImpl implements AllergyService {
    private final AllergyRepository allergyRepository;
    private final HealthRecordService healthRecordService;

    public AllergyServiceImpl() {
        this.allergyRepository = new AllergyRepositoryImpl();
        this.healthRecordService = new HealthRecordServiceImpl();
    }

    public void create(Allergy allergy) {
        allergy.setId(null);
        allergyRepository.create(allergy);
    }

    public void update(Allergy allergy) {
        allergyRepository.update(allergy);
    }

}
