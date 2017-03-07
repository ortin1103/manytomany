package com.nitro;

import org.springframework.data.repository.CrudRepository;


public interface BookRepo extends CrudRepository<Book,Long> {

    Book findBookByName(String name);
}
