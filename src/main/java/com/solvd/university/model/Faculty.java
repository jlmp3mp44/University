package com.solvd.university.model;

public class Faculty {
    private Long id;
    private String title;
    private String description;
    private String dekan;
    private Long universityId;

    public Faculty(String title, String description, String dekan, Long univerityid) {
        this.title = title;
        this.description = description;
        this.dekan = dekan;
        this.universityId = univerityid;
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

    public String getDekan() {
        return dekan;
    }

    public void setDekan(String dekan) {
        this.dekan = dekan;
    }

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }
}
