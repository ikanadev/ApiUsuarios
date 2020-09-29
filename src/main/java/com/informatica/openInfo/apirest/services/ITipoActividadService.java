package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.TipoActividad;

public interface ITipoActividadService {
	
public List<TipoActividad> findAll();
	
	public TipoActividad findById(Long id);
	
	public TipoActividad save(TipoActividad tipoActividad);
	
	public void delete(Long id);

}
