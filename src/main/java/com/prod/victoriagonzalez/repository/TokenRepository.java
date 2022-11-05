package com.prod.victoriagonzalez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prod.victoriagonzalez.model.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {

}
