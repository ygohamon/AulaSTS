package br.com.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.locadora.repository.ClienteRepository;
import br.com.locadora.model.Cliente;
@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;
	
	public void salvar(Cliente cliente) {
		repository.save(cliente);
	}
	public List<Cliente> remover(Cliente cliente) {
		
		List<Cliente> clientes = repository.findAll();
		
		repository.delete(cliente);
		
		return clientes;
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
