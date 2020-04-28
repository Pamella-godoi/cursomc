package com.pamella.cursomc.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// diretiva do spring boot

@RestController
@RequestMapping
public class CategoriaResource {

	//para ser funcao tem que associar com algum verbo do http
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está ok";
	}
}

