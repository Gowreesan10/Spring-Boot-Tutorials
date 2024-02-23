package com.example.annotation_based_dependancy_injection;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {

    public void assist() {
        System.out.println("Nurse is assisting....");
    }
}
