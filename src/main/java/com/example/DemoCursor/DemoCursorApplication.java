package com.example.DemoCursor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.DemoCursor")  // Add this line
public class DemoCursorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCursorApplication.class, args);
    }
}