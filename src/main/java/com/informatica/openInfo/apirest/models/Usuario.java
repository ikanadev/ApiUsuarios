package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable{
	
	@Id
	@Column(unique = true)
	public String codRegistro;
	
	private String nombreCompleto;
	
	private String sexo;
	
	private String correo;
	
	private String telefono;
	
	private String foto;
	
	private String institucion;
	
	private String habilitado;
	
	private LocalDateTime createAt;
	
	private static final long serialVersionUID = 1L;

}
