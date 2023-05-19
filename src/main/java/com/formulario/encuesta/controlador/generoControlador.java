package com.formulario.encuesta.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formulario.encuesta.modelo.Genero;
import com.formulario.encuesta.repositorio.GeneroRepositorio;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class generoControlador {
	
	@Autowired
	private GeneroRepositorio repo;
	
	@GetMapping("/genero")
	public List<Genero> listarGenero(){
		return repo.findAll();
	}
	
	@PostMapping("/genero")
	public Genero guardarGenero(@RequestBody Genero genero) {
		return repo.save(genero);
	}
	

}
