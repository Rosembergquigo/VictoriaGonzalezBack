package com.prod.victoriagonzalez.controller;

import java.util.Base64;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prod.victoriagonzalez.model.Token;
import com.prod.victoriagonzalez.service.TokenService;
@RestController
@RequestMapping(path="/api/token")
public class TokenController extends CommonController<Token, TokenService> {
	
	@GetMapping("/gen/{ced}")
	public ResponseEntity<?> ObtenerToken(@PathVariable String ced){
		
		Token tokenSession = new Token();
		tokenSession.setCedula(ced);
		tokenSession.prepertSist();
		String tkn = ced + tokenSession.getFecha().getTime();
		tokenSession.setToken(Base64.getEncoder().encodeToString(tkn.getBytes()));
		return ResponseEntity.ok().body(service.save(tokenSession));
	}
	
}
