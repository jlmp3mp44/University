package com.solvd.university.model;

import java.sql.Date;

public class Exam {
    private Long id;
    private String title;
    private Date date;
    private String description;
    private Long specialityId;
    private int time;


    public Exam(String title, Date date, String descpription, Long specialityId, int time) {
        this.title = title;
        this.date = date;
        this.description = descpription;
        this.specialityId = specialityId;
        this.time = time;
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

    public Long getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(Long specialityId) {
        this.specialityId = specialityId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
