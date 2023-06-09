package com.epam.upskill.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class RestCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCalculatorApplication.class, args);
	}

}