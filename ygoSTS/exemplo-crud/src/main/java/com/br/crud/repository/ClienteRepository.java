package com.br.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.crud.main.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}
