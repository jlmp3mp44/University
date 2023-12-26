package com.solvd.university.service;

import com.solvd.university.model.Price;

public interface PriceService {
    void create(Price price);

    Price findById(Long priceId);
}
