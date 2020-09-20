package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario implements Serializable{
	

	@Id
	private String codRegistro;
	
	private String nombreCompleto;
	
	private String sexo;
	
	private String correo;
	
	private String telefono;
	
	private String institucion;
	
	private String habilitado;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	
	
	public String getCodRegistro() {
		return codRegistro;
	}



	public void setCodRegistro(String codRegistro) {
		this.codRegistro = codRegistro;
	}



	public String getNombreCompleto() {
		return nombreCompleto;
	}



	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getInstitucion() {
		return institucion;
	}



	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}



	public String getHabilitado() {
		return habilitado;
	}



	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}



	public Date getCreateAt() {
		return createAt;
	}



	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}



	private static final long serialVersionUID = 1L;

}
