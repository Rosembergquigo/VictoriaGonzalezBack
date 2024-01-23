package com.prod.victoriagonzalez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prod.victoriagonzalez.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
