package com.informatica.openInfo.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatica.openInfo.apirest.Dao.IEquipoDao;
import com.informatica.openInfo.apirest.models.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{
	
	@Autowired
	private IEquipoDao equipoDao;

	@Override
	public List<Equipo> findAll() {
		// TODO Auto-generated method stub
		return (List<Equipo>) equipoDao.findAll();
	}

	@Override
	public Equipo findById(Long idEquipo) {
		// TODO Auto-generated method stub
		return equipoDao.findById(idEquipo).orElse(null);
	}

	@Override
	public Equipo save(Equipo actividad) {
		// TODO Auto-generated method stub
		return equipoDao.save(actividad);
	}

	@Override
	public void delete(Long idEquipo) {
		// TODO Auto-generated method stub
		equipoDao.deleteById(idEquipo);
		
	}

}
