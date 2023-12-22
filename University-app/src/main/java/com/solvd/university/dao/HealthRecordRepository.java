package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.HealthRecord;

import java.util.List;

public interface HealthRecordRepository {
    HealthRecord create(HealthRecord healthRecord);
    HealthRecord updateById(Long id);
    HealthRecord deleteById(Long id);
    HealthRecord findById(Long id);
    List<HealthRecord> findAll();
}
