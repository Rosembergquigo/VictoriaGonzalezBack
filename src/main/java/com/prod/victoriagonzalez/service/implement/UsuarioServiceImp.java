package com.prod.victoriagonzalez.service.implement;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.prod.victoriagonzalez.model.Usuario;
import com.prod.victoriagonzalez.repository.UsuarioRepository;
import com.prod.victoriagonzalez.service.UsuarioService;

@Service
public class UsuarioServiceImp extends CommonServiceImp<Usuario, UsuarioRepository> implements UsuarioService {
	
	public Usuario findUserByLogin(String id, String contrasena) {
		return repository.findByCedulaAndContrasena(id, contrasena);
	}

	
}
