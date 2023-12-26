package com.solvd.university.service.impl;

import com.solvd.university.dao.PaymentRepository;
import com.solvd.university.dao.impl.PaymentRepositoryImpl;
import com.solvd.university.model.Payment;
import com.solvd.university.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl() {
        this.paymentRepository = new PaymentRepositoryImpl();
    }

    public void create(Payment payment) {
        if(payment.getPriceId()!=null && payment.getStudentId()!=null) {
            payment.setId(null);
            paymentRepository.create(payment);
        }
    }

    public void delete(Payment payment) {
        paymentRepository.delete(payment);
    }
}
