package com.udemy.sdjpa.repositories;

import com.udemy.sdjpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
