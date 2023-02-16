package com.denisnazarov.springboot_api.api_task;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.sql.SQLException;

@SpringBootApplication
public class ApiTaskApplication {

	public static void main(String... args) {

		SpringApplication.run(ApiTaskApplication.class, args);
	}
}