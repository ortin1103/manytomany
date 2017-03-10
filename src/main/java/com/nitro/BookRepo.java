package com.nitro;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Book,Long> {
   Book findBookByName(String name);
   //List<Book> findBookByName(String name);
}
