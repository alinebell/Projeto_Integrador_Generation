package com.generation.ProjetoIntegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria") 
public class CategoriaModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotBlank (message = "O atributo categorias é obrigatório e não pode utilizar espaços em branco!") 
	@Size(min = 5, max = 20, message = "O atributo categorias deve conter no mínimo 05 e no máximo 20 caracteres")
	private String categorias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}
	
	
}
