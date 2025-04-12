package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Lucy";
    // @Autowired - Not recommended because can be not found by IOC Container
    private final Vehicle vehicle;

    @Autowired // Recommended. Spring do this by default
    public Person(Vehicle vehicle) {
        System.out.println("Person Bean created by Spring");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    // @Autowired - Not recommended
    /*public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }*/

    public void printHello() {
        System.out.println("Hello from Component Person Bean");
    }

}
