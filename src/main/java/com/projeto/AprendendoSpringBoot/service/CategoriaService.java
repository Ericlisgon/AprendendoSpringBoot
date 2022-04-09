package com.projeto.AprendendoSpringBoot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.AprendendoSpringBoot.domain.Categoria;
import com.projeto.AprendendoSpringBoot.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired // para instanciar, deve ser anotado como @Autowired
	private CategoriaRepository repo; //Dependencia de Categoria
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
