package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class exercicio1 {
	
	@GetMapping
	public String objetivos() {
		return "Hello Generaters. \nCom essa atividade, desenvolvi a habilidade de atenção aos detalhes e a mentalidade de persistência.";
	}
}
