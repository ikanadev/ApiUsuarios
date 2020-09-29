package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.Participante;

public interface IParticipanteService {
	
	public List<Participante> findAll();
	
	public Participante findById(String idParticipante);
	
	public Participante save(Participante participante);
	
	public void delete(String idParticipante);

}
