package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.FacultyRepository;
import com.solvd.university.model.Faculty;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FacultyRepositoryMyBatisImpl implements FacultyRepository {

    @Override
    public void create(Faculty faculty) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            FacultyRepository facultyRepository = sqlSession.getMapper(FacultyRepository.class);
            facultyRepository.create(faculty);
        } catch (Exception e) {
            System.out.println("Error creating a faculty: " + e.getMessage());
            e.printStackTrace(); //
        }
    }

    @Override
    public List<Faculty> findAll() {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            FacultyRepository facultyRepository = sqlSession.getMapper(FacultyRepository.class);
            return facultyRepository.findAll();
        }
    }
}
