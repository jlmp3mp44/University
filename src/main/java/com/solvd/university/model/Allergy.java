package com.solvd.university.model;

import java.sql.Date;

public class Allergy {
    private String title;
    private Long id;
    private String pills;
    private Date date;
    private Long healthRecordId;

    public Allergy(String title, String pills, Date date, Long healthRecordId) {
        this.title = title;
        this.pills = pills;
        this.date = date;
        this.healthRecordId = healthRecordId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPills() {
        return pills;
    }

    public void setPills(String pills) {
        this.pills = pills;
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
