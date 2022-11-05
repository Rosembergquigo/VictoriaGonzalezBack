package com.prod.victoriagonzalez.service;

import com.prod.victoriagonzalez.model.Usuario;

public interface UsuarioService extends CommonService<Usuario> {
	public Usuario findUserByLogin(String cedula, String contrasena);
}
