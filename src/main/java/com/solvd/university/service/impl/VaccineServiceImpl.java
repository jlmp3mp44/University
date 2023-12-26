package com.solvd.university.service.impl;

import com.solvd.university.dao.VaccineRepository;
import com.solvd.university.dao.impl.VaccineRepositoryImpl;
import com.solvd.university.model.Vaccine;
import com.solvd.university.service.VaccineService;

public class VaccineServiceImpl implements VaccineService {
    private final VaccineRepository vaccineRepository;

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
