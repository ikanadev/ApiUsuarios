package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.Actividad;

public interface IActividadService {

	public List<Actividad> findAll();
	
	public Actividad findById(String idActividad);
	
	public Actividad save(Actividad actividad);
	
	public void delete(String idActividad);
}
