package com.solvd.university.service.impl;

import com.solvd.university.dao.EducationalRepository;
import com.solvd.university.dao.impl.FacultyRepositoryImpl;
import com.solvd.university.model.Faculty;
import com.solvd.university.service.EducationalService;

import java.util.List;

public class FacultyServiceImpl implements EducationalService<Faculty> {

    private final EducationalRepository facultyRepository;

    public FacultyServiceImpl() {
        this.facultyRepository = new FacultyRepositoryImpl();
    }

    public void create(Faculty faculty) {
        if(faculty.getTitle()!=null & faculty.getDekan()!=null & faculty.getUniversityId()!=null) {
            faculty.setId(null);
            facultyRepository.create(faculty);
        }
    }

    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }
}
