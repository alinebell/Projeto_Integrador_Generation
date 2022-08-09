package com.generation.ProjetoIntegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@NotBlank(message = "O atributo nomeUsuario é obrigatório e não pode utilizar espaços em branco!")
	public String nomeUsuario;
	
	@NotBlank(message = "O atributo usuário é obrigatório e não pode utilizar espaços em branco!") 
	public String usuario;
	
	@NotBlank(message = "O atributo senha é obrigatório e não pode utilizar espaços em branco!") 
	@Size(min = 6, max = 8, message = "O atributo senha deve conter no mínimo 06 e no máximo 08 caracteres")
	public String senha;
	
	public String foto;
	
	
	
	
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
	
	
}
