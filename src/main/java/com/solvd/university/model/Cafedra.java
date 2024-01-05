package com.solvd.university.model;

import java.util.List;

public class Cafedra {
    private Long id;
    private String title;
    private String description;
    private Long facultyId;
    private List<Speciality> specialities;

    public Cafedra() {
    }

    public Cafedra(String title, String description, Long facultyId) {
        this.title = title;
        this.description = description;
        this.facultyId = facultyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Long facultyId) {
        this.facultyId = facultyId;
    }

    public List<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
    }
}
