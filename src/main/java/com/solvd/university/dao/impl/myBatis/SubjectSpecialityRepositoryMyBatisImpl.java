package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.model.Exam;
import com.solvd.university.model.Speciality;
import com.solvd.university.model.Student;
import com.solvd.university.model.Subject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class SubjectSpecialityRepositoryMyBatisImpl implements ManyToManyRepository<Subject, Speciality> {

    @Override
    @Insert("createSubjectsSpecialities")
    public void create(Subject subject, Speciality speciality) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            ManyToManyRepository<Subject, Speciality> subjectSpecialityRepository = sqlSession.getMapper(ManyToManyRepository.class);
            subjectSpecialityRepository.create(subject, speciality);
        }
    }
}
