package com.library;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class MainApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookRepository repo = context.getBean(BookRepository.class);

            // Save some books
            repo.save(new Book("The Hobbit", "J.R.R. Tolkien"));
            repo.save(new Book("1984", "George Orwell"));

            // Fetch all books
            System.out.println("All books:");
            repo.findAll().forEach(book -> System.out.println(book));
        } // context is automatically closed here
    }
}
