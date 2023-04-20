package com.example.EurekaServiceRegistary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegistaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistaryApplication.class, args);
	}

}
