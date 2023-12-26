package com.solvd.university.service;

import com.solvd.university.model.Payment;

public interface PaymentService {
    void create(Payment payment);

    void delete(Payment payment);
}
