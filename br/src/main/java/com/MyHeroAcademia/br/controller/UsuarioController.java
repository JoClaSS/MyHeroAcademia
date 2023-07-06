package com.MyHeroAcademia.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MyHeroAcademia.br.model.Usuario;
import com.MyHeroAcademia.br.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioService uService;
	
	@PostMapping("/cadastro")
	@ResponseBody
	public String cadastrarAtualizar(@RequestBody Usuario usuario) {
		return this.uService.saveUpdate(usuario);
	}
	
	@PostMapping("/deletar")
	@ResponseBody
	public String deletar(@RequestParam("idUsuario") Long idUsuario) {
		return this.uService.delete(idUsuario);
	}
	
}
