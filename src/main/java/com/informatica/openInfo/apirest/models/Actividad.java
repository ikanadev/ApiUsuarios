package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import lombok.Data;


@Entity
@Data
public class Actividad implements Serializable{
	
	@Id
	private String idActividad;
	
	private String titulo;
	
	private String descripcion;
	
	private String banner;
	
	private String linkVideo;
	
	private Date fecha;
	
	private Date hora;
	
	private boolean habilitado;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	private TipoActividad tipoActividad;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	private TipoProyecto tipoProyecto;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIdentityReference(alwaysAsId = true)
	private Gestion gestion;
	
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt=new Date();
	}
	
	private static final long serialVersionUID = 1L;
	
	

}
