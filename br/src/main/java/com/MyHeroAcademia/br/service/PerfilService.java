package com.MyHeroAcademia.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyHeroAcademia.br.model.Perfil;
import com.MyHeroAcademia.br.repository.PerfilRepository;

@Service
public class PerfilService {
	
	@Autowired
	private PerfilRepository pDao;
	
	public String saveUpdate(Perfil perfil) {
		try {
			this.pDao.saveAndFlush(perfil);
			return "Perfil cadastro com sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String delete(Long idPerfil) {
		Perfil perfil = new Perfil();
		try {
			perfil = pDao.findById(idPerfil).orElseThrow();
			perfil.setAtivo(false);
			this.pDao.saveAndFlush(perfil);
			return "Perfil removido";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
