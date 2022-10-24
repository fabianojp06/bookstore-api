package com.fabiano.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiano.bookstore.domain.Categoria;
import com.fabiano.bookstore.domain.Livro;
import com.fabiano.bookstore.repositories.LivroRepository;
import com.fabiano.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;

	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + " , Tipo" + Categoria.class.getName(), null));
	}

	public List<Livro> findAll() {
		return repository.findAll();
	}

}
