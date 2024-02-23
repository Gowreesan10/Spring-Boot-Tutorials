package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //here we are going to use xml based context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        //Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.demo.Doctor' available
        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());
        doctor.getNurse().assist();

        //using id - nurse
        Nurse nurse = (Nurse) applicationContext.getBean("nurse");
        nurse.assist();

        Staff staff = applicationContext.getBean(Doctor.class);
        staff.assist();
    }

}
