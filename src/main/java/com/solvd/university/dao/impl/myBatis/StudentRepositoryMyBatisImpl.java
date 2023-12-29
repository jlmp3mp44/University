package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class StudentRepositoryMyBatisImpl implements PersonRepository<Student> {

    @Override
    @Insert("createStudent")
    public void create(Student student) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            PersonRepository<Student> studentRepository = sqlSession.getMapper(PersonRepository.class);
            studentRepository.create(student);
        }
    }

    @Override
    public void delete(Student student) {
        try(SqlSession sqlSession =  ConfigMyBatis.getSessionFactory().openSession(true)) {
            PersonRepository<Student> studentRepository =  sqlSession.getMapper(PersonRepository.class);
            studentRepository.delete(student);
        }
    }

    @Override
    public List<Optional<Student>> findAll() {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            PersonRepository<Student> studentRepository = sqlSession.getMapper(PersonRepository.class);
            return studentRepository.findAll();
        }
    }
}

