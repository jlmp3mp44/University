package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.AssessmentRepository;
import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.model.Exam;
import com.solvd.university.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class ExamRepositoryMyBatisImpl implements AssessmentRepository<Exam> {
    @Override
    @Insert("createExam")
    public void create(Exam exam) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            AssessmentRepository<Exam> examRepository = sqlSession.getMapper(AssessmentRepository.class);
            examRepository.create(exam);
        }
        catch (Exception e){
            System.out.println("Error creating a exam: " + e.getMessage());
            e.printStackTrace(); //
        }
    }

    @Override
    public Exam findById(Long id) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            AssessmentRepository<Exam> examRepository = sqlSession.getMapper(AssessmentRepository.class);
            return examRepository.findById(id);
        }
    }
}
