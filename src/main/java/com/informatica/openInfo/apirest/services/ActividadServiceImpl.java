package com.informatica.openInfo.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatica.openInfo.apirest.Dao.IActividadDao;
import com.informatica.openInfo.apirest.models.Actividad;

@Service
public class ActividadServiceImpl implements IActividadService{

	@Autowired
	private IActividadDao actividadDao;
	
	@Override
	public List<Actividad> findAll() {
		// TODO Auto-generated method stub
		return (List<Actividad>) actividadDao.findAll();
	}

	@Override
	public Actividad findById(String idActividad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actividad save(Actividad actividad) {
		// TODO Auto-generated method stub
		return actividadDao.save(actividad);
	}

	@Override
	public void delete(String idActividad) {
		// TODO Auto-generated method stub
		actividadDao.deleteById(idActividad);
	}

}
