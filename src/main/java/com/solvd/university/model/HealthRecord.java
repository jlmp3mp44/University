package com.solvd.university.model;

public class HealthRecord {
    private Long id;
    private String medicalReport;

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
}
