package br.com.locadora.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Nome é informação obrigatória.")
	private String nome;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Nome é informação obrigatória.")
	private String email;
	
	private String telefones;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Nome é informação obrigatória.")
	private String CPF;
	
	public Cliente() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefones() {
		return telefones;
	}
	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	

}
