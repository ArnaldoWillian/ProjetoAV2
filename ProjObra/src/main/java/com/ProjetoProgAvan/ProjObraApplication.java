package com.ProjetoProgAvan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProjObraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjObraApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Olá Mundo";
	}
}
