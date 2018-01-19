package com.br.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	//public Cliente findOne(Long id) {
	//	return service.findOne(id);
	//}
	public void editar(Cliente cliente) {
		service.editar(cliente);
	}
	@GetMapping("/delete/id")
	public void delete(@PathVariable("id")Long id){
		service.remover(service.findOne(id));
		
	}
	@GetMapping("/Buscar/{id}")
	public ResponseEntity <Cliente> findId(@PathVariable("id")Long id){
		Cliente cliente = service.findOne(id);
		if(cliente == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Cliente>(cliente,HttpStatus.OK);
	}
	
	@GetMapping("listar")
	public ResponseEntity<List<Cliente>> Listar(){
		List<Cliente> clientes = service.listar();
		if(clientes.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Cliente>>(clientes,HttpStatus.OK);
	}
}
