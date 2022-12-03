package com.moko.laboratoirebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LaboratoireBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaboratoireBackendApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello world!!!";
	}
}
