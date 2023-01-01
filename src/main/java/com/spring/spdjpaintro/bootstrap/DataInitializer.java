package com.spring.spdjpaintro.bootstrap;

import com.spring.spdjpaintro.domain.Book;
import com.spring.spdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {


    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {

         Book bookDDD=  new Book("Domain Driven Design","123","RandomHouse");
         Book saved = bookRepository.save(bookDDD);



    }
}
