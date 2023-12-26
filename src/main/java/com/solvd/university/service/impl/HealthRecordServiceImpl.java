package com.solvd.university.service.impl;

import com.solvd.university.dao.HealthRecordRepository;
import com.solvd.university.dao.impl.HealthRecordRepositoryImpl;
import com.solvd.university.model.HealthRecord;
import com.solvd.university.service.HealthRecordService;

public class HealthRecordServiceImpl implements HealthRecordService {

    private final HealthRecordRepository healthRecordRepository;

    public HealthRecordServiceImpl() {
        this.healthRecordRepository = new HealthRecordRepositoryImpl();
    }

    public HealthRecord create(HealthRecord healthRecord) {
        healthRecord.setId(null);
        healthRecordRepository.create(healthRecord);
        return healthRecord;
    }

    public HealthRecord findById(Long id) {
        return healthRecordRepository.findById(id);
    }

}
