package com.fabiano.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabiano.bookstore.domain.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer> {

}
