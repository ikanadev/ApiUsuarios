package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.informatica.openInfo.apirest.models.embedKeys.EquipoActividadKey;
import lombok.Data;

@Entity
@Data
public class EquipoActividad implements Serializable{

	@EmbeddedId
	private EquipoActividadKey id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idEquipo")
	@JsonIdentityReference(alwaysAsId = true)
	private Equipo equipo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idActividad")
	@JsonIdentityReference(alwaysAsId = true)
	private Actividad actividad;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Jurado jurado;
	
	private Long notaFinal;
	
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt=new Date();
	}
	
	private static final long serialVersionUID = 1L;
}
