package com.lti.projectgladiator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.lti.projectgladiator.controller","com.lti.projectgladiator.service","com.lti.projectgladiator.dao","com.lti.projectgladiator.dto"})
@EntityScan("com.lti.projectgladiator.entity")
public class FarmacistApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmacistApplication.class, args);
		System.out.println("Great!");
	}
}
