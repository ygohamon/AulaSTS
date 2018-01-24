package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class Seguranca {
@Autowired
public void ConfiguracaoGlobal(AuthenticationManagerBuilder build) throws Exception {
	
	build.inMemoryAuthentication().withUser("Negão").password("159").roles("master").and()
	.withUser("Nega").password("123").roles("adm");
}
}
