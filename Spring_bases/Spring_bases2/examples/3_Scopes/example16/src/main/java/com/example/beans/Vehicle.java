package com.example.beans;

import com.example.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;
    private VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        System.out.println("Vehicle Bean created by Spring");
        this.name = "Toyota";
        this.vehicleService = vehicleService;
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

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
