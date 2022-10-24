package com.fabiano.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiano.bookstore.domain.Livro;
import com.fabiano.bookstore.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;
	
	public List<Livro> findAll() {
		return repository.findAll();
	}

}
