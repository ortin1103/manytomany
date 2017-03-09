package com.nitro;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AvtorRepo extends PagingAndSortingRepository<Avtor,Long> {
    Avtor findAvtorByName(String name);
}
