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
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;
import lombok.Data;

@Entity
@Data
public class UsuarioRol implements Serializable{
	
	@EmbeddedId
	private UsuarioRolKey id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codRegistro")
	@JsonIdentityReference(alwaysAsId = true)
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("idRol")
	@JsonIdentityReference(alwaysAsId = true)
	private Rol rol;
	
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt=new Date();
	}
	
	private static final long serialVersionUID = 1L;

}
