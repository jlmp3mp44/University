package com.solvd.university.service;

import com.solvd.university.model.HealthRecord;

public interface HealthRecordService {
    public HealthRecord create(HealthRecord healthRecord);

    public HealthRecord findById(Long id);
}
