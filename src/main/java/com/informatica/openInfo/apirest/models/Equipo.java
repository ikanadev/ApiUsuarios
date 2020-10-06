package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import lombok.Data;


@Entity
@Data
public class Equipo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEquipo;
	
	private String nombre;
	
	private String descripcion;
	
	private String logo;
	
	private boolean habilitado;
	
	private Date createAt;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	private TipoEquipo tipoEquipo;
	
	@PrePersist
	public void prePersist() {
		createAt=new Date();
	}

	private static final long serialVersionUID = 1L;
}
