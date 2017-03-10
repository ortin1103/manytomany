package com.nitro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	BookRepo bookRepo;

	@Autowired
	AvtorRepo avtorRepo;

	@EventListener
	@Transactional
	void start(ContextRefreshedEvent event) {

		List<Book> books = bookRepo.findAll();

		Set<Avtor> avtorSet = books.get(0).getAvtors();
		int a = 1;
		int b = 0;

		a = a / (b == 0 ? 1 : b);
		System.out.println(books);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
