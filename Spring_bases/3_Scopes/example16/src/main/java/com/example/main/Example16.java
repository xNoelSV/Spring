package com.example.main;

import com.example.services.VehicleService;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example16 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean("vehicleService", VehicleService.class);
        System.out.println("HashCode vehicleService1: " + vehicleService1.hashCode());
        System.out.println("HashCode vehicleService2: " + vehicleService2.hashCode());
        if (vehicleService1 == vehicleService2) {
            System.out.println("VehicleService bean is Singleton scoped bean");
        } else {
            System.out.println("VehicleService bean is Prototype scoped bean");
        }

    }
}
