package com.generation.ProjetoIntegrador.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.ProjetoIntegrador.model.UsuarioModel;
import com.generation.ProjetoIntegrador.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetails{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Optional<UsuarioModel> usuario = usuarioRepository.findByUsuarioModel(userName);

		if (usuario.isPresent())
			return new UserDetailsImpl(usuario.get());
		else
			throw new ResponseStatusException(HttpStatus.FORBIDDEN);
	}
}
