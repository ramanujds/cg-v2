package com.capg.demo.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieCatelogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatelogServiceApplication.class, args);
	}

}
