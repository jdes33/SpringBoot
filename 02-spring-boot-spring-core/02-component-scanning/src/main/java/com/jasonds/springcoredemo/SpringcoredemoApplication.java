package com.jasonds.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
// since we put a @Component in a package outside the main springcoredemo package...
// we will have to manually set scanBasePackages to all the pacakges that it should search through (it will recursively search through ones specified)
@SpringBootApplication(
		scanBasePackages = {"com.jasonds.springcoredemo",
							"com.jasonds.util"}
)*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
