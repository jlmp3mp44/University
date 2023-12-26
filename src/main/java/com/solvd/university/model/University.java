package com.solvd.university.model;

public class University {
    private Long id;
    private String title;
    private String rector;

    public University(String title, String rector) {
        this.title = title;
        this.rector = rector;
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

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }
}
