package com.niit.userauthenticationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages="com.niit.userauthenticationservice.controller")
@EnableEurekaClient
public class UserAuthenticationService {

	public static void main(String[] args) {
		SpringApplication.run(UserAuthenticationService.class, args);
	}
}
