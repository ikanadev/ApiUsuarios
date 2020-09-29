package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.Equipo;

public interface IEquipoService {

	public List<Equipo> findAll();
	
	public Equipo findById(Long idEquipo);
	
	public Equipo save(Equipo actividad);
	
	public void delete(Long idEquipo);
}
