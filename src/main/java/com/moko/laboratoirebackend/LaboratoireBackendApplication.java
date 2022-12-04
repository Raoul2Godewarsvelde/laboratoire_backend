package com.moko.laboratoirebackend;

import com.moko.laboratoirebackend.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class LaboratoireBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaboratoireBackendApplication.class, args);
	}
}
