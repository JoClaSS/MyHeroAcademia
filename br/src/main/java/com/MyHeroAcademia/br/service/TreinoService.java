package com.MyHeroAcademia.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyHeroAcademia.br.model.Treino;
import com.MyHeroAcademia.br.repository.TreinoRepository;

@Service
public class TreinoService {
	
	@Autowired
	private TreinoRepository tDao;
	
	public String saveUpdate(Treino treino) {
		try {
			tDao.saveAndFlush(treino);
			return "Treino cadastrado com sucesso!";
		} catch (Exception e) {
			return e.getMessage();
		}	
	}
	
	public String delete(Long idTreino) {
		Treino treino = new Treino();
		try {
			treino = tDao.findById(idTreino).orElseThrow();
			treino.setAtivo(false);
			tDao.saveAndFlush(treino);
			return "Treino removido!";
		} catch (Exception e) {
			return e.getMessage();
		}	
	}
	
	public List<Treino> findAllAtivos(Long idAluno) {
		try {
			return tDao.findAtivosByUsuario(idAluno);
		} catch (Exception e) {
			return null;
		}	
	}
	
}
