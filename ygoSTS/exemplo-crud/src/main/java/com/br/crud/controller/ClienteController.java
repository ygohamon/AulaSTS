package com.br.crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.br.crud.main.Cliente;
import com.br.crud.service.ClienteService;

@Controller

public class ClienteController {
	@Autowired
	private ClienteService service;
	public void salva(Cliente cliente) {
		service.salvar(cliente);
	}
	public void remover(Long id) {
		service.remover(id);
	}
	public Cliente findOne(Long id) {
		return service.findOne(id);
	}
	public void editar(Cliente cliente) {
		service.editar(cliente);
	}
	public List<Cliente> listar(){
	 return	service.listar();
	}
}
