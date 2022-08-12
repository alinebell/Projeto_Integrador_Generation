package com.generation.ProjetoIntegrador.model;

public class UsuarioLogin {
	
	private Long id;
	private String nome;
	private String usuario;
	private String senha;
	private String foto;
	private String token;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	public String getFoto() {
		return foto;
	}
	public String getToken() {
		return token;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
