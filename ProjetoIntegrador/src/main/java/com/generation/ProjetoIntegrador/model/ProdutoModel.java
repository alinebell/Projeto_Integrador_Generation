package com.generation.ProjetoIntegrador.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produtos")

public class ProdutoModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=5, max=100, message = "O atributo nome do produto deve ter no mínimo 5 e no máximo 100 caracteres! ")
	private String nomeProduto;
	
	@NotBlank
	private BigDecimal preco;
	
	@NotBlank
	@Size(min=5, max=1000, message = "O atributo descrição deve ter no mínimo 5 e no máximo 1000 caracteres! ")
	private String descricao;
	
	@NotBlank
	@Size(min=5, max=100, message = "O atributo modelo deve ter no mínimo 5 e no máximo 100 caracteres! ")
	private String modelo;
	
	@ManyToOne
	@JsonIgnoreProperties ("produto")
	private CategoriaModel categoria;
	
	

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}	
	
}
