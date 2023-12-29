package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.EducationalRepository;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.dao.impl.jdbc.FacultyRepositoryImpl;
import com.solvd.university.model.Faculty;
import com.solvd.university.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FacultyRepositoryMyBatisImpl implements EducationalRepository<Faculty> {

    @Override
    @Insert("createFaculty")
    public void create(Faculty faculty) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            EducationalRepository<Faculty> facultyRepository = sqlSession.getMapper(EducationalRepository.class);
            facultyRepository.create(faculty);
        }
    }

    @Override
    public List<Faculty> findAll() {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            EducationalRepository<Faculty> facultyRepository = sqlSession.getMapper(EducationalRepository.class);
             return facultyRepository.findAll();
        }
    }
}
