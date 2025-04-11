package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * This configuration class is used to define the beans for the project.
 */
@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota Corolla");
        return vehicle;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("John Doe");
        person.setVehicle(vehicle());
        return person;
    }

}
