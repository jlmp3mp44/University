package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.AllergyRepository;
import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.model.Allergy;
import org.apache.ibatis.session.SqlSession;

public class AllergyRepositoryMyBatisImpl implements AllergyRepository {
    @Override
    public void create(Allergy allergy) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            AllergyRepository allergyRepository = sqlSession.getMapper(AllergyRepository.class);
            allergyRepository.create(allergy);
        } catch (Exception e) {
            System.out.println("Error creating an allergy: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void update(Allergy allergy) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            AllergyRepository allergyRepository = sqlSession.getMapper(AllergyRepository.class);
            allergyRepository.update(allergy);
        } catch (Exception e) {
            System.out.println("Error updating an allergy: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
