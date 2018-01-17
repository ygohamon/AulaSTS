package com.br.crud.service;

import java.util.ArrayList;

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
	public void edit(Cliente cliente) {
		repository.saveAndFlush(cliente);
	}
	public ArrayList<Cliente> clientes(){
		repository.findAll();
		return clientes();
	}
}
