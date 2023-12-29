package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.EducationalRepository;
import com.solvd.university.dao.MedicalRepository;
import com.solvd.university.model.Cafedra;
import com.solvd.university.model.HealthRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CafedraRepositoryMyBatisImpl implements EducationalRepository<Cafedra> {

    @Override
    @Insert("createCafedra")
    public void create(Cafedra cafedra) {
        try(SqlSession sqlSession =  ConfigMyBatis.getSessionFactory().openSession(true)) {
            EducationalRepository<Cafedra> cafedraRepository =  sqlSession.getMapper(EducationalRepository.class);
            cafedraRepository.create(cafedra);
        }
        catch (Exception e){
            System.out.println("Error creating a cafedra: " + e.getMessage());
            e.printStackTrace(); //
        }
    }


    @Override
    public void delete(Cafedra cafedra) {
        try(SqlSession sqlSession =  ConfigMyBatis.getSessionFactory().openSession(true)) {
            EducationalRepository<Cafedra> cafedraRepository =  sqlSession.getMapper(EducationalRepository.class);
            cafedraRepository.delete(cafedra);
        }
    }
}
