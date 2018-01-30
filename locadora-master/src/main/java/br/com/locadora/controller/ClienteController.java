package br.com.locadora.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.locadora.model.Cliente;
import br.com.locadora.model.Grupo;
import br.com.locadora.model.Usuario;
import br.com.locadora.repository.filtros.FiltroUsuario;
import br.com.locadora.service.ClienteService;

@Controller
public class ClienteController {
	
	public static String CADASTRAR_CLIENTES = "/clientes/addCliente";
	
	public static String LISTAR_CLIENTES = "/clientes/cliente";
	
	@Autowired
	private ClienteService service;
	
	/*
	public void salva(Cliente cliente) {
		service.salvar(cliente);
	}
	
	@GetMapping("/editarr/{id}")
	public void editar(@PathVariable ("id") Long id) {
		
		service.editar(service.findOne(id));
	}
	
	@GetMapping("/deletee/{id}")
	public List<Cliente> delete(@PathVariable("id")Long id){
		List<Cliente> clientes = service.listar();
		
		service.remover(service.findOne(id));
		
		return clientes;
	}
	@GetMapping("/Buscarr/{id}")
	public ResponseEntity <Cliente> findId(@PathVariable("id")Long id){
		Cliente cliente = service.findOne(id);
		if(cliente == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Cliente>(cliente,HttpStatus.OK);
	}
	
	@GetMapping("listarr")
	public ResponseEntity<List<Cliente>> Listar(){
		List<Cliente> clientes = service.listar();
		if(clientes.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Cliente>>(clientes,HttpStatus.OK);
	}*/
	
	@GetMapping("/clientes")
	public ModelAndView findAll() {		
		ModelAndView mav = new ModelAndView(LISTAR_CLIENTES);
		List<Cliente> clientes = this.service.listar();
		mav.addObject("clientes", clientes);
		return mav;
	}

	@GetMapping("/addd")
	public ModelAndView add(Cliente cliente) {
		ModelAndView mav = new ModelAndView(CADASTRAR_CLIENTES);
		mav.addObject("cliente", cliente);
		service.salvar(cliente);
		return mav;
	}

	/*
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return add(usuarioServer.findOne(id));
	}
	
	@GetMapping("/showPermissao/{id}")
	public ModelAndView permissaoUsuario(@PathVariable("id") Long idUsuario) {
		ModelAndView mv = new  ModelAndView();
		List<Grupo> gruposUsuario = this.grupoService.listaGrupoPorIdUsuario(idUsuario);
		mv.addObject("gruposUsuario", gruposUsuario);
		return mv;
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id, RedirectAttributes attributes) {
		ModelAndView mvRedirect = new  ModelAndView("redirect:/usuarios");
		usuarioServer.remove(id);
		attributes.addFlashAttribute("sucesso", "Usuário removido com sucesso!");
		return mvRedirect;
	}
	

	@PostMapping("/save")
	public ModelAndView save(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes) {
		ModelAndView mv = new  ModelAndView(CADASTRAR_USUARIOS);
		
		if (result.hasErrors()) {
			return mv;
		}
		
		usuarioServer.save(usuario);
		ModelAndView mvRedirect = new  ModelAndView("redirect:/usuarios");
		attributes.addFlashAttribute("sucesso", "Usuário adicionado com sucesso!");
		return mvRedirect;
	}*/
}
