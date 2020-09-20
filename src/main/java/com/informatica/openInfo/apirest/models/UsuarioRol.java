package com.informatica.openInfo.apirest.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;

@Entity
public class UsuarioRol implements Serializable{
	
	@EmbeddedId
	private UsuarioRolKey id=new UsuarioRolKey();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("codRegistro")
	@JsonIdentityReference(alwaysAsId = true)
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	@MapsId("idRol")
	private Rol rol;
	
	String password;
	
	

	public UsuarioRolKey getId() {
		return id;
	}



	public void setId(UsuarioRolKey id) {
		this.id = id;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public Rol getRol() {
		return rol;
	}



	public void setRol(Rol rol) {
		this.rol = rol;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	private static final long serialVersionUID = 1L;

}
