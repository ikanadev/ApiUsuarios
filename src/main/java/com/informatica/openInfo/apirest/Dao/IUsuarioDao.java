package com.informatica.openInfo.apirest.Dao;

import org.springframework.data.repository.CrudRepository;

import com.informatica.openInfo.apirest.models.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, String>{

	Usuario findByCorreo(String correo);
}
