package com.prod.victoriagonzalez.service.implement;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.prod.victoriagonzalez.model.Perfil;
import com.prod.victoriagonzalez.repository.PerfilRepository;
import com.prod.victoriagonzalez.service.PerfilService;
@Service
public class PerfilServiceImp extends CommonServiceImp<Perfil, PerfilRepository> implements PerfilService {

}
