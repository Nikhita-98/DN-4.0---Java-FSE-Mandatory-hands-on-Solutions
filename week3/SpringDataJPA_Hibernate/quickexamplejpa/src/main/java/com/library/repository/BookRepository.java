package com.library.repository;

import com.library.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    // Spring Data JPA provides all CRUD methods automatically
}
