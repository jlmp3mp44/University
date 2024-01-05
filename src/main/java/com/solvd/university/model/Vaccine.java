package com.solvd.university.model;

import java.sql.Date;

public class Vaccine {
    private Long id;
    private String title;
    private String description;
    private Date data;
    private Long healthRecordId;

    public Vaccine() {
    }

    public Vaccine(String title, String description, Date data, Long healthRecordId) {
        this.title = title;
        this.description = description;
        this.data = data;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getHealthRecordId() {
        return healthRecordId;
    }

    public void setHealthRecordId(Long healthRecordId) {
        this.healthRecordId = healthRecordId;
    }
}
