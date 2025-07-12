package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;

@Service
public class CountryService {

    @SuppressWarnings("unchecked")
    public Country getCountry(String code) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            List<Country> countries = (List<Country>) context.getBean("countryList");
            return countries.stream()
                    .filter(country -> country.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElse(null);
        }
    }
}
