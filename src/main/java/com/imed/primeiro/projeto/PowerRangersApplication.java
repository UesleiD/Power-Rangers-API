package com.imed.primeiro.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class PowerRangersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerRangersApplication.class, args);
	}

}
