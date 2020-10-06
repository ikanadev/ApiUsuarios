package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Gestion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String gestion;
	
	private Date fechaIni;
	
	private Date fechaFin;
	
	private String descripcion; 
	
	
	private static final long serialVersionUID = 1L;

}
