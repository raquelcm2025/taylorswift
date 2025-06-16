package com.cibertec.taylor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.taylor.model.Artista;
import com.cibertec.taylor.service.ArtistaService;

@Controller
@RequestMapping("/artistas")
public class ArtistaController {
	@Autowired
	private ArtistaService service;
	
	@GetMapping
	public String listar(Model model) {
		model.addAttribute("lista", service.listar());
		return "artistas";
	}
	@GetMapping("/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("artista", new Artista());
		return "form";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Artista artista, RedirectAttributes redirect) {
		service.guardar(artista);
		redirect.addFlashAttribute("mensaje", "Artista registrado correctamente");
		return "redirect:/artistas";
	}

	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
	    Artista artista = service.buscarPorId(id);
	    model.addAttribute("artista", artista);
	    return "form";
	}

		
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Long id, RedirectAttributes redirect) {
	    service.eliminar(id);
	    redirect.addFlashAttribute("mensaje", "Artista eliminado correctamente");
	    return "redirect:/artistas";
	}


}
