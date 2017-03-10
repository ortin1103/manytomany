package com.nitro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AvtorRepo extends JpaRepository<Avtor,Long> {
   Avtor findAvtorByName(String name);
   // List<Avtor> findAvtorByName(String name);
}
