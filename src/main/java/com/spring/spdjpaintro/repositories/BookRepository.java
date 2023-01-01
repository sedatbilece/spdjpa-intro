package com.spring.spdjpaintro.repositories;

import com.spring.spdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book,Long> {



}
