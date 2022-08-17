package com.generation.ProjetoIntegrador.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name="tb_usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@NotNull(message = "O atributo nomeUsuario é obrigatório e não pode utilizar espaços em branco!")
	public String nomeUsuario;
	
	@Schema(example = "email@email.com")
	@NotNull(message = "O atributo usuário é obrigatório e não pode utilizar espaços em branco!") 
	@Email(message="O atributo e-mail é obrigatório")
	public String usuario;
	
	@NotBlank(message = "O atributo senha é obrigatório e não pode utilizar espaços em branco!") 
	@Size(min = 8, message = "O atributo senha deve conter no mínimo 08 caracteres")
	public String senha;
	
	@Size(max = 5000, message = "O link da foto não pode ser maior do que 5000 caracteres")
	public String foto;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List <ProdutoModel> produto;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
		
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
		
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
		
	}
	public String getFoto() {
		return foto;
		
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public List<ProdutoModel> getProduto() {
		return produto;
	}
	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
	
	
	
	
}
