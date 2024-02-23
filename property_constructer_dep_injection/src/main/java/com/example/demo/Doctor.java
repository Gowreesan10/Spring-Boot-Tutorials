package com.example.demo;

public class Doctor implements Staff {
    private String qualification;
    private Nurse nurse;

    public Doctor(String qualification, Nurse nurse) {
        this.qualification = qualification;
        this.nurse = nurse;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Nurse getNurse() {
        System.out.println("Return nurse");
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}
