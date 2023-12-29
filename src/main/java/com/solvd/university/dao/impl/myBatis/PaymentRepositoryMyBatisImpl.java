package com.solvd.university.dao.impl.myBatis;

import com.solvd.university.dao.ConfigMyBatis;
import com.solvd.university.dao.PaymentRepository;
import com.solvd.university.dao.PersonRepository;
import com.solvd.university.dao.impl.jdbc.PaymentRepositoryImpl;
import com.solvd.university.model.Payment;
import com.solvd.university.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

public class PaymentRepositoryMyBatisImpl implements PaymentRepository {
    @Override
    public void create(Payment payment) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            sqlSession.getMapper(PaymentRepository.class).create(payment);
        }

        catch (Exception e){
            System.out.println("Error creating a payment: " + e.getMessage());
            e.printStackTrace(); //
        }
    }

    @Override
    public void delete(Payment payment) {
        try (SqlSession sqlSession = ConfigMyBatis.getSessionFactory().openSession(true)) {
            PaymentRepository paymentRepository = sqlSession.getMapper(PaymentRepository.class);
            paymentRepository.delete(payment);
        }
    }
}
