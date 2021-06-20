package com.ratingsdataservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ratingsdataservice")
@SpringBootApplication
public class RatingsDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsDataServiceApplication.class, args);
	}

}
