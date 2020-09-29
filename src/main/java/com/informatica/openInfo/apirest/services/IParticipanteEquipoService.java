package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.ParticipanteEquipo;

public interface IParticipanteEquipoService {
	
	public List<ParticipanteEquipo> findAll();
	
	public ParticipanteEquipo findById(Long idParticipanteEquipo);
	
	public ParticipanteEquipo save(ParticipanteEquipo participanteEquipo);
	
	public void delete(Long idParticipanteEquipo);

}
