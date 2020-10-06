package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.PrePersist;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioActividadKey;
import lombok.Data;

@Entity
@Data
public class UsuarioActividad implements Serializable{

	@EmbeddedId
	private UsuarioActividadKey id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codRegistro")
	@JsonIdentityReference(alwaysAsId = true)
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idActividad")
	@JsonIdentityReference(alwaysAsId = true)
	private Actividad actividad;
	
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt=new Date();
	}
	
	private static final long serialVersionUID = 1L;

}
