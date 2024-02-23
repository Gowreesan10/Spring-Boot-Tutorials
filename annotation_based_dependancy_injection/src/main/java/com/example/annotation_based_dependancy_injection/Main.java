package com.example.annotation_based_dependancy_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());
        doctor.getNurse().assist();
        System.out.println(doctor);

        Nurse nurse = (Nurse) applicationContext.getBean("nurse");
        nurse.assist();

        Staff staff = applicationContext.getBean(Doctor.class);
        staff.assist();
    }

}
