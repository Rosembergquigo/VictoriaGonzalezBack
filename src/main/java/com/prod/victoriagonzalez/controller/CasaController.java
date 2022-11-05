package com.prod.victoriagonzalez.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prod.victoriagonzalez.model.Casa;
import com.prod.victoriagonzalez.service.CasaService;

@RestController
@RequestMapping(path = "/casa")
public class CasaController extends CommonController<Casa, CasaService> {

}
