package com.solvd.university.model;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private Long healthRecordID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getHealthRecordID() {
        return healthRecordID;
    }

    public void setHealthRecordID(Long healthRecordID) {
        this.healthRecordID = healthRecordID;
    }
}
