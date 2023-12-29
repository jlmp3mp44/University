package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.MedicalRepository;
import com.solvd.university.model.Vaccine;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class VaccineRepositoryMyBatisImpl implements MedicalRepository<Vaccine> {

    @Override
    public void create(Vaccine vaccine) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            MedicalRepository<Vaccine> vaccineRepository = sqlSession.getMapper(MedicalRepository.class);
            vaccineRepository.create(vaccine);
        }
    }

    @Override
    public void update(Vaccine vaccine) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            MedicalRepository<Vaccine> vaccineRepository = sqlSession.getMapper(MedicalRepository.class);
            vaccineRepository.update(vaccine);
        }
    }
}
