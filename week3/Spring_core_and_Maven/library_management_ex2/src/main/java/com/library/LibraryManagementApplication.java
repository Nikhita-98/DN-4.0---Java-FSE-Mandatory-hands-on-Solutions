package com.library;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Retrieve the BookService bean
        try ( // Use ConfigurableApplicationContext to enable .close()
                ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            // Retrieve the BookService bean
            BookService bookService = context.getBean("bookService", BookService.class);
            // Use the service
            bookService.addBook("Effective Java");
            // Close the context to release resources
        }
    }
}
