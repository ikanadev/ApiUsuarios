package com.informatica.openInfo.apirest.models.embedKeys;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UsuarioRolKey implements Serializable{
	
	
	private String codRegistro;
	
	private Long idRol;

	public String getCodRegistro() {
		return codRegistro;
	}

	public void setCodRegistro(String codRegistro) {
		this.codRegistro = codRegistro;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codRegistro == null) ? 0 : codRegistro.hashCode());
		result = prime * result + ((idRol == null) ? 0 : idRol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioRolKey other = (UsuarioRolKey) obj;
		if (codRegistro == null) {
			if (other.codRegistro != null)
				return false;
		} else if (!codRegistro.equals(other.codRegistro))
			return false;
		if (idRol == null) {
			if (other.idRol != null)
				return false;
		} else if (!idRol.equals(other.idRol))
			return false;
		return true;
	}
	
	private static final long serialVersionUID = 1L;

	
	

}
