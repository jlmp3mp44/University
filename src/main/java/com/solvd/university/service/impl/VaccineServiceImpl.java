package com.solvd.university.service.impl;

import com.solvd.university.dao.MedicalRepository;
import com.solvd.university.dao.impl.myBatis.VaccineRepositoryMyBatisImpl;
import com.solvd.university.model.Vaccine;
import com.solvd.university.service.MedicalService;

public class VaccineServiceImpl implements MedicalService<Vaccine> {
    private final MedicalRepository vaccineRepository;

    public VaccineServiceImpl() {
        this.vaccineRepository = new VaccineRepositoryMyBatisImpl();
    }

    public void create(Vaccine vaccine) {
        if(vaccine.getTitle()!=null) {
            vaccine.setId(null);
            vaccineRepository.create(vaccine);
        }
    }

    public void update(Vaccine vaccine) {
        vaccineRepository.update(vaccine);
    }
}
