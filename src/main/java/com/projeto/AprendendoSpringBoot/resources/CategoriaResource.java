package com.projeto.AprendendoSpringBoot.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.AprendendoSpringBoot.domain.Categoria;
import com.projeto.AprendendoSpringBoot.service.CategoriaService;


@RestController 
@RequestMapping(value="/categorias") // Utilizado para mapear as classes.
public class CategoriaResource {
	
	@Autowired
	private CategoriaService repo;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET) // Escolhendo o método que vai ser usado busca(GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = repo.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}