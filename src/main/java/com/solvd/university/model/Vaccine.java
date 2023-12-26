package com.solvd.university.model;

import java.sql.Date;

public class Vaccine {
    private Long id;
    private String title;
    private String description;
    private Date date;
    private Long healthRecordId;

    public Vaccine(String title, String description, Date date, Long healthRecordId) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.healthRecordId = healthRecordId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getHealthRecordId() {
        return healthRecordId;
    }

    public void setHealthRecordId(Long healthRecordId) {
        this.healthRecordId = healthRecordId;
    }
}
