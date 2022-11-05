package com.prod.victoriagonzalez.service.implement;

import org.springframework.stereotype.Service;

import com.prod.victoriagonzalez.model.Token;
import com.prod.victoriagonzalez.repository.TokenRepository;
import com.prod.victoriagonzalez.service.TokenService;

@Service
public class TokenServiceImp extends CommonServiceImp<Token, TokenRepository> implements TokenService {

	

}
