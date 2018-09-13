package com.numions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication //
@EnableEurekaClient
public class ExampleApplication {


	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args); /*Ejecutar aplicacion de forma aislada*/
	}
}
