package com.nitro;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface BookRepo extends PagingAndSortingRepository<Book,Long> {

}
