package com.prod.victoriagonzalez.service.implement;

import org.springframework.stereotype.Service;

import com.prod.victoriagonzalez.model.Casa;
import com.prod.victoriagonzalez.repository.CasaRepository;
import com.prod.victoriagonzalez.service.CasaService;

@Service
public class CasaServiceImp extends CommonServiceImp<Casa, CasaRepository> implements CasaService {

}
