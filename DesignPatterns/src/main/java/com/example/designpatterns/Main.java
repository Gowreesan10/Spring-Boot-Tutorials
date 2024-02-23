package com.example.designpatterns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());
        System.out.println(doctor);
        doctor.setQualification("Mphil");
        System.out.println(doctor);

        Doctor doctor1 = applicationContext.getBean(Doctor.class);
        System.out.println(doctor1);
    }

}
