package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
@Lazy
public class Person {

    private String name = "Lucy";
    private Vehicle vehicle;

    @Autowired
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void printHello() {
        System.out.println("Hello from Component Person Bean");
    }

}
