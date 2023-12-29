package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.MedicalRepository;
import com.solvd.university.model.HealthRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class HealthRecordRepositoryMyBatisImpl implements MedicalRepository<HealthRecord> {

    @Override
    @Insert("createHealthRecord")
    public void create(HealthRecord healthRecord) {
        try(SqlSession sqlSession =  ConfigMyBatis.getSessionFactory().openSession(true)) {
            MedicalRepository<HealthRecord> healthRecordRepository =  sqlSession.getMapper(MedicalRepository.class);
            healthRecordRepository.create(healthRecord);
        }
    }

    @Override
    public void update(HealthRecord healthRecord) {
        try(SqlSession sqlSession =  ConfigMyBatis.getSessionFactory().openSession(true)) {
            MedicalRepository<HealthRecord> healthRecordRepository =  sqlSession.getMapper(MedicalRepository.class);
            healthRecordRepository.update(healthRecord);
        }
    }

    @Override
    public HealthRecord findById(Long id) {
        try(SqlSession sqlSession =  ConfigMyBatis.getSessionFactory().openSession(true)) {
            MedicalRepository<HealthRecord> healthRecordRepository =  sqlSession.getMapper(MedicalRepository.class);
            return healthRecordRepository.findById(id);
        }
    }
}
