package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.MedicalRepository;
import com.solvd.university.model.Allergy;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class AllergyRepositoryMyBatisImpl implements MedicalRepository<Allergy> {
    @Override
    public void create(Allergy allergy) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            MedicalRepository<Allergy> allergyRepository = sqlSession.getMapper(MedicalRepository.class);
            allergyRepository.create(allergy);
        }
    }


    @Override
    public void update(Allergy allergy) {
        MedicalRepository.super.update(allergy);
    }

    @Override
    public Allergy findById(Long id) {
        return MedicalRepository.super.findById(id);
    }
}
