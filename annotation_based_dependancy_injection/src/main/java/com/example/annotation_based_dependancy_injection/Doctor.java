package com.example.annotation_based_dependancy_injection;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Doctor implements Staff {

    public void assist() {
        System.out.println("Doctor is assisting.....");
    }

    @Getter
    @Setter
    private String qualification;

    @Getter
    @Setter
    @Autowired
    private Nurse nurse;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                ", nurse=" + nurse +
                '}';
    }
}
