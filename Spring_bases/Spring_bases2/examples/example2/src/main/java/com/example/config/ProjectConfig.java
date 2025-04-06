package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This configuration class is used to define the beans for the project.
 */
@Configuration
public class ProjectConfig {

    /**
     * Creates and returns a Vehicle bean instance.
     *
     * This method configures a Vehicle object, sets its name to "Audi 8",
     * and registers it as a Spring bean in the application context.
     *
     * @return a configured Vehicle instance.
     */
    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    /**
     * Returns a simple hello world message.
     *
     * @return a hello world message.
     */
    @Bean
    String helloI () {
        return "Hello World";
    }

    /**
     * Returns a predefined integer value.
     *
     * @return an integer value.
     */
    @Bean
    Integer number () {
        return 16;
    }

}
