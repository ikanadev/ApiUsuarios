package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
	
	private String password;
	
	private boolean habilitado;
	
	private static final long serialVersionUID = 1L;

}
