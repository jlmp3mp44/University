package com.solvd.university.dao;

import com.solvd.university.model.Cafedra;
import com.solvd.university.model.Price;

import java.util.List;

public interface PriceRepository {
    Price create(Price price);
    Price updateById(Long id);
    Price deleteById(Long id);
    Price findById(Long id);
    List<Price> findAll();
}
