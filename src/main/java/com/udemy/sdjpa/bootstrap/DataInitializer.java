package com.udemy.sdjpa.bootstrap;

import com.udemy.sdjpa.entity.Book;
import com.udemy.sdjpa.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
//        bookRepository.deleteAll();

        Book bookEDD = new Book(null, "Entity Driven Design", "123", "Publisher", null);

        Book savedEDD = bookRepository.save(bookEDD);

    }
}
