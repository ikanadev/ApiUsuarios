package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.TipoEquipo;

public interface ITipoEquipoService {
	
	public List<TipoEquipo> findAll();
	
	public TipoEquipo findById(Long id);
	
	public TipoEquipo save(TipoEquipo tipoEquipo);
	
	public void delete(Long id);

}
