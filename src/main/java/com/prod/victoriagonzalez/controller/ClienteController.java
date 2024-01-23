package com.prod.victoriagonzalez.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prod.victoriagonzalez.model.Cliente;
import com.prod.victoriagonzalez.service.ClienteService;

@RestController
@RequestMapping(path="/api/cliente")
public class ClienteController extends CommonController<Cliente, ClienteService> {

}
