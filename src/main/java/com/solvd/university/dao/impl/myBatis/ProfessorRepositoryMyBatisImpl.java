package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.model.Professor;
import com.solvd.university.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

public class ProfessorRepositoryMyBatisImpl implements PersonRepository<Professor> {
    @Override
    @Insert("createProfessor")
    public void create(Professor professor) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            PersonRepository<Professor> professorRepository = sqlSession.getMapper(PersonRepository.class);
            professorRepository.create(professor);
        }
    }

    @Override
    public void delete(Professor professor) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            PersonRepository<Professor> professorRepository = sqlSession.getMapper(PersonRepository.class);
            professorRepository.delete(professor);
        }
    }

    @Override
    public List<Optional<Professor>> findAll() {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            PersonRepository<Professor> professorRepository = sqlSession.getMapper(PersonRepository.class);
            return professorRepository.findAll();
        }
    }
}
