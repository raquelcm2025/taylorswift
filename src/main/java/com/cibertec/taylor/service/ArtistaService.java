package com.cibertec.taylor.service;

import java.util.List;

import com.cibertec.taylor.model.Artista;

public interface ArtistaService {
	List<Artista> listar();
	Artista guardar(Artista artista);
	void eliminar(Long id);
	Artista buscarPorId(Long id);
		
}
