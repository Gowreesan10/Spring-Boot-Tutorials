package com.example.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //logging
        //Authentication & Authorization
        //Sanitize data
        System.out.println("Checkout Method from shopping cart called.");
    }
}
