package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Payment;

import java.util.List;

public interface PaymentRepository {
    Payment create(Payment payment);
    Payment updateById(Long id);
    Payment deleteById(Long id);
    Payment findById(Long id);
    List<Payment> findAll();
}
