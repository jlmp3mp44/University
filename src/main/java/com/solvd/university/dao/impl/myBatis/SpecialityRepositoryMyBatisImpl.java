package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.EducationalRepository;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.model.Speciality;
import com.solvd.university.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SpecialityRepositoryMyBatisImpl implements EducationalRepository<Speciality> {

    @Override
    @Insert("createSpeciality")
    public void create(Speciality speciality) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            EducationalRepository<Speciality> specialityRepository = sqlSession.getMapper(EducationalRepository.class);
            specialityRepository.create(speciality);
        }
    }

    @Override
    public void update(Speciality speciality) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            EducationalRepository<Speciality> specialityRepository = sqlSession.getMapper(EducationalRepository.class);
            specialityRepository.update(speciality);
        }
    }
}
