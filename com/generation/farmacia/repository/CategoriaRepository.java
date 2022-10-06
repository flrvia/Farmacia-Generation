package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Categoria;


@Repository 
//responsável pela interação com o banco de dados, que vai fazer as querys como o select
//atraves de palavras chaves que representa comandos da linguagem mysql
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
	
}
