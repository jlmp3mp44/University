package com.solvd.university.service.impl;

import com.solvd.university.dao.MedicalRepository;
import com.solvd.university.dao.impl.VaccineRepositoryImpl;
import com.solvd.university.model.Vaccine;
import com.solvd.university.service.MedicalService;

public class VaccineServiceImpl implements MedicalService<Vaccine> {
    private final MedicalRepository vaccineRepository;

    public VaccineServiceImpl() {
        this.vaccineRepository = new VaccineRepositoryImpl();
    }

    public void create(Vaccine vaccine) {
        vaccine.setId(null);
        vaccineRepository.create(vaccine);
    }

    public void update(Vaccine vaccine) {
        vaccineRepository.update(vaccine);
    }
}
