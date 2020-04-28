package com.pamella.cursomc.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pamella.cursomc.domain.Categoria;

// diretiva do spring boot

@RestController
@RequestMapping
public class CategoriaResource {

	private static final int Categoria = 0;

	//para ser funcao tem que associar com algum verbo do http
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		// criaçao de objeto
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		
		// lista de categoria
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}

