package com.cvrce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.cvrce.domain")
@EnableJpaRepositories(basePackages = "com.cvrce.repository")
@SpringBootApplication
public class CvrceUniversityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvrceUniversityApplication.class, args);
	}

}
