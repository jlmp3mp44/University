package com.solvd.university.service.impl;

import com.solvd.university.dao.FacultyRepository;
import com.solvd.university.dao.impl.FacultyRepositoryImpl;
import com.solvd.university.model.Faculty;
import com.solvd.university.service.FacultyService;

import java.util.List;

public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl() {
        this.facultyRepository = new FacultyRepositoryImpl();
    }

    public void create(Faculty faculty) {
        faculty.setId(null);
        facultyRepository.create(faculty);
    }

    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }
}
