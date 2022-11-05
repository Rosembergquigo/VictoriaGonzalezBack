package com.prod.victoriagonzalez.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prod.victoriagonzalez.model.Usuario;
import com.prod.victoriagonzalez.service.UsuarioService;

@RestController
@RequestMapping(path = "/api/usuario")
public class UsuarioController extends CommonController<Usuario, UsuarioService> {
	
	@PostMapping("/ingreso")
	  public ResponseEntity<?> ingresar(@RequestBody Usuario usuario,BindingResult result)
	  {
		  return ResponseEntity.ok().body(service.findUserByLogin(usuario.getCedula(), usuario.getContrasena()));
	  }
	
	
}
