package com.persbank.persbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(/*exclude = {DataSourceAutoConfiguration.class }*/
		scanBasePackages = {"com.persbank.persbank.domain.model",
				"com.persbank.persbank.domain.repository",
				"com.persbank.persbank.domain.service",
				"com.persbank.persbank.controller"})
public class PersbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersbankApplication.class, args);
	}

}
