package com.nitro;

import org.springframework.data.repository.CrudRepository;

public interface AvtorRepo extends CrudRepository<Avtor,Long> {
   Avtor findAvtorByName(String name);
   // List<Avtor> findAvtorByName(String name);
}
