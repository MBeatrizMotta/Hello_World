package org.generation.hello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/helloworld") //Informa o endereço da web
@RestController //Informa que é um controller
public class helloController {
	
	@GetMapping //Pega informação do método e exibe
	public String hello() {
	return "Hello World! Seja, bem vindos ao Spring!";
	}


	
}