package com.solvd.university.service.impl;

import com.solvd.university.dao.MedicalRepository;
import com.solvd.university.dao.impl.HealthRecordRepositoryImpl;
import com.solvd.university.model.HealthRecord;
import com.solvd.university.service.MedicalService;

public class HealthRecordServiceImpl implements MedicalService<HealthRecord> {

    private final MedicalRepository healthRecordRepository;

    public HealthRecordServiceImpl() {
        this.healthRecordRepository = new HealthRecordRepositoryImpl();
    }

    public void create(HealthRecord healthRecord) {
        healthRecord.setId(null);
        healthRecordRepository.create(healthRecord);
    }

    public HealthRecord findById(Long id) {
        return (HealthRecord) healthRecordRepository.findById(id);
    }

}
