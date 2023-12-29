package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.model.Exam;
import com.solvd.university.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class StudentsExamsRepositoryMyBatisImpl implements ManyToManyRepository<Student, Exam> {

    @Override
    @Insert("createStudentsExams")
    public void create(Student student, Exam exam) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            ManyToManyRepository<Student, Exam> studentExamRepository = sqlSession.getMapper(ManyToManyRepository.class);
            studentExamRepository.create(student, exam);
        }
    }
}
