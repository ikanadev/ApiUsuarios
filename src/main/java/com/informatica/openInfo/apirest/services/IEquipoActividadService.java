package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.EquipoActividad;
import com.informatica.openInfo.apirest.models.embedKeys.EquipoActividadKey;

public interface IEquipoActividadService {
	
	public List<EquipoActividad> findAll();
	
	public EquipoActividad findByIdAc(String idActividad);
	
	public EquipoActividad findByIdEq(Long idEquipo);
	
	public EquipoActividad save(EquipoActividad actividad);
	
	public void delete(EquipoActividadKey id);

}
