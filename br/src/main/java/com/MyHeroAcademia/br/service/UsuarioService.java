package com.MyHeroAcademia.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyHeroAcademia.br.model.Usuario;
import com.MyHeroAcademia.br.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository uDao;
	
	public String saveUpdate(Usuario usuario) {
		try {
			uDao.saveAndFlush(usuario);
			return "Usuario cadastrado com sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}	
	}
	
	public String delete(Long idusuario) {
		Usuario usuario = new Usuario();
		try {
			usuario = uDao.findById(idusuario).orElseThrow();
			usuario.setAtivo(false);
			uDao.saveAndFlush(usuario);
			return "Usuario deletado!";
		} catch (Exception e) {
			return e.getMessage();
		}	
	}
	

}
