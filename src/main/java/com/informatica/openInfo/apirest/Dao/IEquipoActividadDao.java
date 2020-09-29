package com.informatica.openInfo.apirest.Dao;

import org.springframework.data.repository.CrudRepository;

import com.informatica.openInfo.apirest.models.EquipoActividad;
import com.informatica.openInfo.apirest.models.embedKeys.EquipoActividadKey;

public interface IEquipoActividadDao extends CrudRepository<EquipoActividad, EquipoActividadKey>{

}
