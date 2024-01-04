package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.PriceRepository;
import com.solvd.university.model.Price;
import org.apache.ibatis.session.SqlSession;

public class PriceRepositoryMyBatisImpl implements PriceRepository {

    @Override
    public void create(Price price) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            sqlSession.getMapper(PriceRepository.class).create(price);
        } catch (Exception e) {
            System.out.println("Error creating a price: " + e.getMessage());
            e.printStackTrace(); //
        }
    }

    @Override
    public Price findById(Long priceId) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            PriceRepository priceRepository = sqlSession.getMapper(PriceRepository.class);
            return priceRepository.findById(priceId);
        }
    }
}
