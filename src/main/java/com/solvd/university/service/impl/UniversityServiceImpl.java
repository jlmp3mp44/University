package com.solvd.university.service.impl;

import com.solvd.university.dao.UniversityRepository;
import com.solvd.university.dao.impl.myBatis.UniversityRepositoryMyBatisImpl;
import com.solvd.university.model.University;
import com.solvd.university.service.EducationalService;

import java.util.List;

public class UniversityServiceImpl implements EducationalService<University> {
    private final UniversityRepository universityRepository;

    public UniversityServiceImpl() {
        this.universityRepository = new UniversityRepositoryMyBatisImpl();
    }

    public void create(University university) {
        if (university.getTitle() != null && university.getRector() != null) {
            university.setId(null);
            universityRepository.create(university);
        }
    }

    public List<University> findAll() {
        return universityRepository.findAll();
    }
}
