package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.ManyToManyRepository;
import com.solvd.university.model.Professor;
import com.solvd.university.model.Speciality;
import com.solvd.university.model.Subject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class SubjectsProfessorsRepositoryMyBatisImpl implements ManyToManyRepository<Subject, Professor> {
    @Override
    @Insert("createSubjectsProfessors")
    public void create(Subject subject, Professor professor) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            ManyToManyRepository<Subject, Professor> subjectProfessorRepository = sqlSession.getMapper(ManyToManyRepository.class);
            subjectProfessorRepository.create(subject, professor);
        }
    }
}
