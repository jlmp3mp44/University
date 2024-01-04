package com.solvd.university.service.impl;

import com.solvd.university.dao.AllergyRepository;
import com.solvd.university.dao.impl.myBatis.AllergyRepositoryMyBatisImpl;
import com.solvd.university.model.Allergy;
import com.solvd.university.service.MedicalService;

public class AllergyServiceImpl implements MedicalService<Allergy> {
    private final AllergyRepository allergyRepository;

    public AllergyServiceImpl() {
        this.allergyRepository = new AllergyRepositoryMyBatisImpl();
    }

    public void create(Allergy allergy) {
        if (allergy.getTitle() != null) {
            allergy.setId(null);
            allergyRepository.create(allergy);
        }
    }

    public void update(Allergy allergy) {
        allergyRepository.update(allergy);
    }

}
