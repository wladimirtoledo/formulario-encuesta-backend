package com.formulario.encuesta.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formulario.encuesta.modelo.Genero;

@Repository
public interface GeneroRepositorio extends JpaRepository<Genero, Long>{

}
