package com.informatica.openInfo.apirest.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.informatica.openInfo.apirest.models.Rol;
import com.informatica.openInfo.apirest.models.UsuarioRol;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;

public interface IUsuarioRolDao extends CrudRepository<UsuarioRol, UsuarioRolKey>{
	
	@Query(value ="select * from usuario_rol where usuario_cod_registro like ?1", nativeQuery = true)
	UsuarioRol buscarPorUsuario(String idUsuario);
	
	@Query(value ="select * from usuario_rol where rol_id_rol like ?1", nativeQuery = true)
	UsuarioRol buscarPorRol(Long idRol);

	
}
