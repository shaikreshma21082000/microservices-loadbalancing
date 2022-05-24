package com.niit.usermovieservice;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages="com.niit.usermovieservice.controllers")
@EnableEurekaClient
@RibbonClient(name = "serv")
public class UserMovieService {

	public static void main(String[] args) throws RestClientException, IOException {
		 SpringApplication.run(
				UserMovieService.class, args);
	}
	@LoadBalanced
    @Bean
    RestTemplate loadBalanced() {
        return new RestTemplate();
    }
	
}
