package com.moviecatalog.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.moviecatalog.resources")
@SpringBootApplication
public class MovieCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogApplication.class, args);
	}

}
