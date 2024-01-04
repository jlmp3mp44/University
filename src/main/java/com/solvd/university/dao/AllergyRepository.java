package com.solvd.university.dao;

import com.solvd.university.model.Allergy;

public interface AllergyRepository {
    void create(Allergy allergy);

    void update(Allergy allergy);
}
