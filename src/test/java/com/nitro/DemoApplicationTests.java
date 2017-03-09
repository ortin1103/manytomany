package com.nitro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);


	@Autowired
	AvtorRepo avtorRepo;
	@Autowired
	BookRepo bookRepo;

	@Before
	@Rollback(false)

	public void setUp() {
		Avtor first = new Avtor("Semen", "Arsenyev");
		Avtor second = new Avtor("Alex", "Jersy");
		Avtor three = new Avtor("Vova", "Geremiy");
		Avtor four = new Avtor("Roman", "Sapkovskiy");

//		first.getBooks().add(new Book("My life"));
//		second.getBooks().add(new Book("Second of wins"));
//		first.getBooks().add(new Book("My firs of dance"));
//		second.getBooks().add(new Book("Seconds of death"));

		Book firsBook= new Book("One+one");

//		firsBook.getAvtors().add(new Avtor("Asadsa","asdfasff"));
//		firsBook.getAvtors().add(avtorRepo.save(new Avtor("sadsa","asdfasff")));

//
//		three.setBooks("One life");
//		four.setBooks("One life");


		avtorRepo.save(Arrays.asList(first, second, three, four));
		bookRepo.save(firsBook);


	}

	@Test
	public void testGetAvtor() {
		Iterable<Avtor> avtors = avtorRepo.findAll();
		for (Avtor avtor : avtors) {
			logger.info(avtor.toString());

		}

	}
	@Test
	public void countAvtor() {
		logger.info("*****************");
		logger.info("**** counts: "+avtorRepo.count());
		logger.info("*****************");
	}
//	@Test
//	public void testGetAvtorByName(){
//		Avtor avtor=avtorRepo.findAvtorByName("Semen");
//		Set<Book> books=avtor.getBooks();
//		for (Book book:books){
//			logger.info(book.toString());
//		}
//	}
	@Test
	public void testAllBooks() {
		logger.info("*****************");
		Iterable<Book> allbooks = bookRepo.findAll();
		for (Book book : allbooks) {
			logger.info(book.getName());
		}
	}
//	@Test
//	public void testGetBookByName() {

//		Book book = bookRepo.findAvtorByName("One+one");
//		Set<Avtor> avtors = book.getAvtors();
//		for (Avtor avtor : avtors) {
//			logger.info(avtor.toString());
//
//		}
//	}


	@After
	public void clean(){
		avtorRepo.deleteAll();

	}

}



