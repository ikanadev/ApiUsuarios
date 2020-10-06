package com.informatica.openInfo.apirest.models;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "idParticipante")
public class Participante extends Usuario  {

	private String ci;
	
	private String foto;
	
	private String gradoAcademico;
	
	private String contacto2;
	
	private String contacto3;
	
	private String participanteEnable;
	
	private Date createdAt;
	
	@PrePersist
	public void prePersist() {
		createdAt=new Date();
	}
	
	
	private static final long serialVersionUID = 1L;

}
