package com.kart.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KartApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(KartApiGatewayApplication.class, args);
	}

}
