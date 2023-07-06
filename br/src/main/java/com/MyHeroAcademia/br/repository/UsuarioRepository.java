package com.MyHeroAcademia.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MyHeroAcademia.br.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>  {

}
