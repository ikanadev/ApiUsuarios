package com.informatica.openInfo.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatica.openInfo.apirest.Dao.IEquipoActividadDao;
import com.informatica.openInfo.apirest.models.EquipoActividad;
import com.informatica.openInfo.apirest.models.embedKeys.EquipoActividadKey;

@Service
public class EquipoActividadServiceImpl implements IEquipoActividadService{

	@Autowired
	private IEquipoActividadDao equipoActividadDao;
	
	@Override
	public List<EquipoActividad> findAll() {
		// TODO Auto-generated method stub
		return (List<EquipoActividad>) equipoActividadDao.findAll();
	}

	@Override
	public EquipoActividad findByIdAc(String idActividad) {
		// TODO Auto-generated method stub
		return equipoActividadDao.findById(new EquipoActividadKey()).orElse(null);
	}

	@Override
	public EquipoActividad findByIdEq(Long idEquipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EquipoActividad save(EquipoActividad actividad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EquipoActividadKey id) {
		// TODO Auto-generated method stub
		equipoActividadDao.deleteById(id);
	}

}
