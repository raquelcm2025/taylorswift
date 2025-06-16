package com.cibertec.taylor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.taylor.repository.ArtistaRepository;
import com.cibertec.taylor.service.ArtistaService;
import com.cibertec.taylor.model.Artista;

@Service
public class ArtistaServiceImpl implements ArtistaService {

	@Autowired
	private ArtistaRepository repo;

	@Override
	public List<Artista> listar() {
		return repo.findAll();
	}

	@Override
	public Artista guardar(Artista artista) {
		return repo.save(artista);
	}

	@Override
	public void eliminar(Long id) {
		repo.deleteById(id);
	}

	@Override
	public Artista buscarPorId(Long id) {
		return repo.findById(id).orElse(null);
	}
	
}
