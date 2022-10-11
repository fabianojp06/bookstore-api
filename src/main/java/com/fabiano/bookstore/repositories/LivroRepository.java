package com.fabiano.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabiano.bookstore.domain.Livro;

@Repository
public interface LivroRepository  extends JpaRepository<Livro, Integer> {

}
