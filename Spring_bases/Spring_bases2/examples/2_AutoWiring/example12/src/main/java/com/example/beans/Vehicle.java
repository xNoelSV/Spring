package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public Vehicle() {
        System.out.println("Vehicle Bean created by Spring");
        this.name = "Toyota";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello from Component Vehicle Bean");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
