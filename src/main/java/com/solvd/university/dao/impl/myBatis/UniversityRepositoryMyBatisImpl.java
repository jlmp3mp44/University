package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.EducationalRepository;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.model.Student;
import com.solvd.university.model.University;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UniversityRepositoryMyBatisImpl implements EducationalRepository<University> {

    @Override
    @Insert("createUniversity")
    public void create(University university) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            EducationalRepository<University> universityRepository = sqlSession.getMapper(EducationalRepository.class);
            universityRepository.create(university);
        }
    }

    @Override
    public List<University> findAll() {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            EducationalRepository<University> universityRepository = sqlSession.getMapper(EducationalRepository.class);
            return universityRepository.findAll();
        }
    }
}
