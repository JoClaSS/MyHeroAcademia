package com.MyHeroAcademia.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MyHeroAcademia.br.model.Perfil;
import com.MyHeroAcademia.br.service.PerfilService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/perfil")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PerfilController {
	
	@Autowired
	PerfilService pService;
	
	@PostMapping("/cadastro")
	@ResponseBody
	public String cadastrarAtualizar(@RequestBody Perfil perfil) {
		return pService.saveUpdate(perfil);
	}
	
	@PostMapping("/deletar")
	@ResponseBody
	public String deletar(@RequestBody Long idPerfil) {
		return pService.delete(idPerfil);
	}
}
