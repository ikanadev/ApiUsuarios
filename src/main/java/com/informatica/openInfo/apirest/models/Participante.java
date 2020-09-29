package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "idParticipante")
public class Participante extends Usuario implements Serializable {

	private String grado;
	
	private String contacto2;
	
	private String contacto3;
	
	private String habilita;
	
	private LocalDateTime createAt;
	
	
	private static final long serialVersionUID = 1L;

}
