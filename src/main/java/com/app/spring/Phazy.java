package com.app.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Phazy {
    public static void main(String [] args) {
        System.out.println("Starting Phazy!");
        SpringApplication.run(Phazy.class, args);
	}
}