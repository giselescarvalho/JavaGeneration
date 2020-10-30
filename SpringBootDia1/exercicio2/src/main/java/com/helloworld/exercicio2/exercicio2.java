package com.helloworld.exercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex2")
public class exercicio2{
	
	@GetMapping
	public String exercicio2()
	{
		return "Objetivos de aprendizagem essa semana: MySQL, Spring Boot e revisão de conceitos de java";
	}
}
