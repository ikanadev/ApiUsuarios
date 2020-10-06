package com.informatica.openInfo.apirest.services;

import java.util.List;

import com.informatica.openInfo.apirest.models.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findById(String codRegistro);
	
	public Usuario findByCorreo(String correo);
	
	public Usuario save(Usuario usuario);
	
	public void delete(String id);
	
	

}
