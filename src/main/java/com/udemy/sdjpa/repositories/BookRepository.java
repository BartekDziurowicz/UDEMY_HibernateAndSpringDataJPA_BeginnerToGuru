package com.udemy.sdjpa.repositories;

import com.udemy.sdjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
