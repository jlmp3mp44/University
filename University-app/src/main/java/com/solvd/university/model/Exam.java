package com.solvd.university.model;

import java.util.Date;

public class Exam {
    private Long id;
    private String title;
    private Date date;
    private String description;
    private Long specilityId;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getSpecilityId() {
        return specilityId;
    }

    public void setSpecilityId(Long specilityId) {
        this.specilityId = specilityId;
    }
}
