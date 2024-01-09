package com.solvd.university.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Faculty {
    @XmlAttribute(name = "id")
    private Long id;
    private String title;
    private String description;
    private String dekan;
    @JsonIgnore
    private Long universityId;
    @XmlElementWrapper(name = "cafedries")
    @XmlElement(name = "cafedra")
    private List<Cafedra> cafedries;

    public Faculty() {
    }

    public Faculty(String title, String description, String dekan, Long universityId) {
        this.title = title;
        this.description = description;
        this.dekan = dekan;
        this.universityId = universityId;
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

    public List<Cafedra> getCafedries() {
        return cafedries;
    }

    public void setCafedries(List<Cafedra> cafedries) {
        this.cafedries = cafedries;
    }
}
