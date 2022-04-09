package com.projeto.AprendendoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.AprendendoSpringBoot.domain.Categoria;


@Repository   //Declarando a class como repositório
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	/*Interface que ira herdar JpaRepository capaz de acessar com base ao tipo que vc passar.
	 *Ira buscar objetos do tipo "Categoria" através do (ID - Integer)-> atributo identificador. */
	
	/*Class capaz de acessar o banco de dados fazer consultas dos dados da tabela "Categoria"*/
}
