package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * This configuration class is used to define the beans for the project.
 */
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

}
