package com.rost.first;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rost.first.services.PeopleService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {
	private final PeopleService peopleService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) {
		peopleService.readAll().forEach(System.out::println);
	}
}
