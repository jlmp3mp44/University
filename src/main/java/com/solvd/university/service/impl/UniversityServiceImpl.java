package com.solvd.university.service.impl;

import com.solvd.university.dao.UniversityRepository;
import com.solvd.university.dao.impl.UniversityRepositoryImpl;
import com.solvd.university.model.University;
import com.solvd.university.service.UniversityService;

import java.util.List;

public class UniversityServiceImpl implements UniversityService {
    private final UniversityRepository universityRepository;

    public UniversityServiceImpl() {
        this.universityRepository = new UniversityRepositoryImpl();
    }

    public void create(University university) {
        university.setId(null);
        universityRepository.create(university);
    }

    public List<University> findAll() {
        return universityRepository.findAll();
    }
}