package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/metodos")
public class metodosController {

	
	String ment [] = { "Comunicação","Mentalidade De Crescimento","Orientação Ao Detalhe", "Orientação Ao Futuro",
			"Trabalho Em Equipe","Responsabilidade Pessoal","Persistência","Proatividade"},saida="";
	
	@GetMapping //Pega informação do método e exibe
	public String mentalidade() {
		for(String mentalidade : ment) {
			saida += mentalidade+"<br/>";
		}
			return saida;
		}
}