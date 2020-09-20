package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.UsuarioRol;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;

public interface IUsuarioRolService {
	
	public List<UsuarioRol> findAll();
	
	public UsuarioRol buscarPorUsuario(String codUsuario);
	
	public UsuarioRol buscarPorRol(Long idRol);
	
	public UsuarioRol save(UsuarioRol rol);
	
	public void delete(UsuarioRolKey id);

}
