package com.solvd.university.service.impl;

import com.solvd.university.dao.HealthRecordRepository;
import com.solvd.university.dao.impl.myBatis.HealthRecordRepositoryMyBatisImpl;
import com.solvd.university.model.HealthRecord;
import com.solvd.university.service.Service;

public class HealthRecordServiceImpl implements Service<HealthRecord> {

    private final HealthRecordRepository healthRecordRepository;

    public HealthRecordServiceImpl() {
        this.healthRecordRepository = new HealthRecordRepositoryMyBatisImpl();
    }

    public void create(HealthRecord healthRecord) {
        healthRecord.setId(null);
        healthRecordRepository.create(healthRecord);
    }

    public HealthRecord findById(Long id) {
        return (HealthRecord) healthRecordRepository.findById(id);
    }

}
