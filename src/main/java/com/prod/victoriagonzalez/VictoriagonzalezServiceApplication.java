package com.prod.victoriagonzalez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.modelmapper.ModelMapper;

@SpringBootApplication
@CrossOrigin({"http://localhost:4200"})
public class VictoriagonzalezServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VictoriagonzalezServiceApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowedHeaders("*").maxAge(36000);
			}
		};
	}
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
