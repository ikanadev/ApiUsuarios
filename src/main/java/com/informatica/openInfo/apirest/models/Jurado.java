package com.informatica.openInfo.apirest.models;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;


@Entity
@Data
@PrimaryKeyJoinColumn(name = "idJurado")
public class Jurado extends Usuario {

	private String gradoAcadem;
	
	private String telefono;

	private Date createdAt;
	
	@PrePersist
	public void prePersist() {
		createdAt=new Date();
	}
	
	private static final long serialVersionUID = 1L;

}
