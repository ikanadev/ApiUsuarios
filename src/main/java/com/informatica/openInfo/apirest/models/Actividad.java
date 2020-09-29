package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Actividad implements Serializable{
	
	@Id
	private String idActividad;
	
	private String nombre;
	
	private String descripcion;
	
	private LocalDate fecha;
	
	private LocalTime hora;
	
	private boolean habilitado;
	
	private String video;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	private TipoActividad tipo;
	
	private static final long serialVersionUID = 1L;
	
	

}
