package com.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.simple"})
@Import({SecurityConfig.class})
public class SimpleLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleLoginApplication.class, args);
	}
}
