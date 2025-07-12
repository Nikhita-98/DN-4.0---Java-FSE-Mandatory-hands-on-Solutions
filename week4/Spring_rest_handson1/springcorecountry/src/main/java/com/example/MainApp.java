package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Country;

public class MainApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Country country = (Country) context.getBean("country");
            System.out.println("Country Name: " + country.getName());
        }
    }
}
