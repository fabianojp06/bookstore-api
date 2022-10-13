	package com.fabiano.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiano.bookstore.domain.Categoria;
import com.fabiano.bookstore.domain.Livro;
import com.fabiano.bookstore.repositories.CategoriaRepository;
import com.fabiano.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Ficção");
		Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografia");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Mark", "Loren Ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis Vertoghen", "Loren Ipsum", cat1);
		Livro l3 = new Livro(null, "The Time Machine", "H.G Wells", "Loren Ipsum", cat2);
		Livro l4 = new Livro(null, "The War of the Worlds", "Isac Asimov", "Loren Ipsum", cat2);
		Livro l5 = new Livro(null, "I, Robot", "Isac Asimov", "Loren Ipsum", cat2);
		
		
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
		
	}

}
