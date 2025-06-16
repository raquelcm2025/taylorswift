package com.cibertec.taylor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.taylor.model.Genero;
import com.cibertec.taylor.repository.GeneroRepository;
import com.cibertec.taylor.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService {
	@Autowired
	private GeneroRepository generoRepo;

	@Override
	public List<Genero> listarTodos() {
		
		return generoRepo.findAll();
	}
	
	
}
