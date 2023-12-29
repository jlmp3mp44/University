package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.AssessmentRepository;
import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.model.Student;
import com.solvd.university.model.Subject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class SubjectRepositoryMyBatisImpl implements AssessmentRepository<Subject> {
    @Override
    @Insert("createSubject")
    public void create(Subject subject) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            AssessmentRepository<Subject> subjectRepository = sqlSession.getMapper(AssessmentRepository.class);
            subjectRepository.create(subject);
        }
    }

    @Override
    public Subject findById(Long id) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            AssessmentRepository<Subject> subjectRepository = sqlSession.getMapper(AssessmentRepository.class);
            return subjectRepository.findById(id);
        }
    }
}
