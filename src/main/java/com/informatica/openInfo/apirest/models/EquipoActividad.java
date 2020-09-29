package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.informatica.openInfo.apirest.models.embedKeys.EquipoActividadKey;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
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
	
	private LocalDateTime createAt;
	
	private static final long serialVersionUID = 1L;
}
