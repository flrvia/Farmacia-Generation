package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Criará uma tabela
@Table(name = "tb_categoria") //indicar o nome da tabela
public class Categoria {

	@Id //indica que é uma chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //aqui indica que a PK é autoincrement
	private Long id;
	
	@NotBlank(message = "O atributo tipo é obrigatório")// para não deixar vazio
	private String tipo;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	
	//getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
