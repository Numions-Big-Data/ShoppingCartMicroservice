package com.numions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication //
@EnableDiscoveryClient
=======
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication //
@EnableEurekaClient
>>>>>>> 8a3106360346c7c24b9a61dba6eff0ffebcac80b
public class ExampleApplication {


	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args); /*Ejecutar aplicacion de forma aislada*/
	}
}
