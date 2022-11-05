package com.prod.victoriagonzalez.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prod.victoriagonzalez.model.Perfil;
import com.prod.victoriagonzalez.service.PerfilService;
@RestController
@RequestMapping(path = "/api/perfil")
public class PerfilController extends CommonController<Perfil, PerfilService> {

}
