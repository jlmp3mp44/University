package com.solvd.university.model;

public class Speciality {
    private Long id;
    private String title;
    private String description;
    private Long cafedraId;

    public Speciality() {
    }

    public Speciality(String title, String description, Long cafedraId) {
        this.title = title;
        this.description = description;
        this.cafedraId = cafedraId;
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

    public Long getCafedraId() {
        return cafedraId;
    }

    public void setCafedraId(Long cafedraId) {
        this.cafedraId = cafedraId;
    }
}
