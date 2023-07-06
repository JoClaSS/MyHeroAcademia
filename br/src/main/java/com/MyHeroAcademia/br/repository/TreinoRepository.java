package com.MyHeroAcademia.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.MyHeroAcademia.br.model.Treino;

public interface TreinoRepository extends JpaRepository<Treino,Long>  {

	
	@Query(value = "SELECT * FROM treino t WHERE (t.aluno_id = :aluno_id and t.ativo = true)", nativeQuery = true)
	List<Treino> findAtivosByUsuario(@Param("aluno_id") Long alunoId);

}
