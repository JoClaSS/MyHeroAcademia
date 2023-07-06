package com.MyHeroAcademia.br.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "dias_semana")
public class DiasSemana {
	
	@Id
	@JsonIgnore
	private Long id;
	
	@Column
	private String dia;

}
