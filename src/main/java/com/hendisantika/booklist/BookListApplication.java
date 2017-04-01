package com.hendisantika.booklist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hendisantika.booklist.domain.Book;
import com.hendisantika.booklist.domain.BookRepository;

@SpringBootApplication
public class BookListApplication {
	private static final Logger log = LoggerFactory.getLogger(BookListApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookListApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Hendi Santika", "Kotlin in Action", "1232323-21", 2017));
			repository.save(new Book("Hendi Santika", "Spring Boot in Action", "2212343-5", 2015));
			repository.save(new Book("Endy Muhardin", "Java Fundamental", "2212343-6", 2016));

			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
