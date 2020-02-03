package com.rest.springboot.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rest"})
public class SpringBootRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRest2Application.class, args);
	}

}
