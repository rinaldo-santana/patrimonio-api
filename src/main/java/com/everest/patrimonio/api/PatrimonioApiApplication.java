package com.everest.patrimonio.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatrimonioApiApplication.class, args);
		System.out.println(">>>> Sistema ok.");
	}
}
