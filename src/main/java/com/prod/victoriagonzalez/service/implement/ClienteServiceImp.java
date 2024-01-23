package com.prod.victoriagonzalez.service.implement;

import org.springframework.stereotype.Service;

import com.prod.victoriagonzalez.model.Cliente;
import com.prod.victoriagonzalez.repository.ClienteRepository;
import com.prod.victoriagonzalez.service.ClienteService;

@Service
public class ClienteServiceImp extends CommonServiceImp<Cliente, ClienteRepository> implements ClienteService {
}
