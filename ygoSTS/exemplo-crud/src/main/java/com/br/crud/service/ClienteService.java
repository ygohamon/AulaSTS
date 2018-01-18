package com.br.crud.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.crud.main.Cliente;
import com.br.crud.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;
	public void salvar(Cliente cliente) {
		repository.save(cliente);
	}
	public void remover(Long id) {
		repository.delete(id);
	}
	public Cliente findOne(Long id) {
		return repository.findOne(id);
		
	}
	public void editar(Cliente cliente) {
		repository.saveAndFlush(cliente);
	}
	public List<Cliente> listar(){
		return repository.findAll();
		
	}
}
