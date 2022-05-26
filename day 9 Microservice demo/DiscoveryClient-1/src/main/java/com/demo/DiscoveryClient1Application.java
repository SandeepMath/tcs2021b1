package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class DiscoveryClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClient1Application.class, args);
	}

}
