package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Equipo implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEquipo;
	
	private String nombre;
	
	private String descripcion;
	
	private boolean habilitado;
	
	private LocalDateTime createAt;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	private TipoEquipo tipo;

	private static final long serialVersionUID = 1L;
}
