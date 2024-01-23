package com.prod.victoriagonzalez.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prod.victoriagonzalez.model.Medida;
import com.prod.victoriagonzalez.service.MedidaService;

@RestController
@RequestMapping(path = "/api/medida")
public class MedidaController extends CommonController<Medida, MedidaService> {

}
