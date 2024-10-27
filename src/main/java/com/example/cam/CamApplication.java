package com.example.cam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.cam.repositories")
public class CamApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamApplication.class, args);
	}

}
