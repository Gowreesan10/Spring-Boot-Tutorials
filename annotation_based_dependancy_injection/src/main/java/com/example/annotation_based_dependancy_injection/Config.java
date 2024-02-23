package com.example.annotation_based_dependancy_injection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//instead of component scan remove component tag and define bean
public class Config {

//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }
//
//    @Bean
//    public Nurse nurse(){
//        return new Nurse();
//    }

}
