package com.github.petervl80.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringdockerApplication {

	@GetMapping("/")
	public String hello() {
		return "Hello from Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdockerApplication.class, args);
	}

}
