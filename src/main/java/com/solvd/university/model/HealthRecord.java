package com.solvd.university.model;

import java.util.List;

public class HealthRecord {
    private Long id;
    private String medicalReport;

    private List<Vaccine> vaccines;
    private List<Allergy> allergies;
    public HealthRecord() {
    }

    public HealthRecord(String medicalReport) {
        this.medicalReport = medicalReport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public String getMedicalReport() {
        return medicalReport;
    }

    public void setMedicalReport(String medicalReport) {
        this.medicalReport = medicalReport;
    }

    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }

    public List<Allergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergy> allergies) {
        this.allergies = allergies;
    }
}
