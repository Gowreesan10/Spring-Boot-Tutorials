package com.example.designpatterns;


import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "singleton")
//@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

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

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean Name method is called...");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method is called...");
    }

}
