package com.spring.spdjpaintro;

import com.spring.spdjpaintro.domain.AuthorUuid;
import com.spring.spdjpaintro.domain.Book;
import com.spring.spdjpaintro.repositories.AuthorUuidRepository;
import com.spring.spdjpaintro.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpdjpaIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpdjpaIntroApplication.class, args);
	}

	@Bean
	CommandLineRunner createInitial(BookRepository bookRepository){

		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {



			}
		};

	}
//test
}
