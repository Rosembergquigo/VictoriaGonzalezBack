package com.prod.victoriagonzalez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prod.victoriagonzalez.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findByCedulaAndContrasena(String cedula, String contrasena);
}
