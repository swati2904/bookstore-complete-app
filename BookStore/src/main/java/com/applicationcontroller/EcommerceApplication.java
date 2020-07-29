package com.applicationcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.controller" })
@EntityScan({"com..model"})
@EnableJpaRepositories({"com.dao"})
public class EcommerceApplication {
	
	public static void main(String[] args) {
//		SpringApplication --this is the main method which runs the whole application.
		SpringApplication.run(EcommerceApplication.class,args);
		}

}
