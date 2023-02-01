package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController 
	@RequestMapping("/objetivos") 
	
	public class objetivoController {

		@GetMapping 
		public String hello() {
			return "Estudar para conseguir realizar as atividades propostas";	
				}
	}
