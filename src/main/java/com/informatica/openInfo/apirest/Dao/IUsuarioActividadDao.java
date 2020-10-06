package com.informatica.openInfo.apirest.Dao;

import org.springframework.data.repository.CrudRepository;

import com.informatica.openInfo.apirest.models.UsuarioActividad;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioActividadKey;

public interface IUsuarioActividadDao extends CrudRepository<UsuarioActividad, UsuarioActividadKey>{

}
