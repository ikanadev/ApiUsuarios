package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
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
	
	private String nombre;
	
	private String sexo;
	
	private String correo;
	
	private String pais;
	
	private String departamento;
	
	private String institucion;
	
	private String ocupacion;
	
	private String usuarioEnable;
	
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt=new Date();
	}
	
	private static final long serialVersionUID = 1L;

}
