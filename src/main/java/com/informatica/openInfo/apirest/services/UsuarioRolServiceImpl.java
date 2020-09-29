package com.informatica.openInfo.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatica.openInfo.apirest.Dao.IRolDao;
import com.informatica.openInfo.apirest.Dao.IUsuarioRolDao;
import com.informatica.openInfo.apirest.models.UsuarioRol;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;

@Service
public class UsuarioRolServiceImpl implements IUsuarioRolService{
	
	
	@Autowired
	public IUsuarioRolDao usuarioRolDao;

	@Override
	public List<UsuarioRol> findAll() {
		// TODO Auto-generated method stub
		return (List<UsuarioRol>) usuarioRolDao.findAll();
	}

	@Override
	public UsuarioRol buscarPorUsuario(String codUsuario) {
		// TODO Auto-generated method stub
		return (UsuarioRol) usuarioRolDao.buscarPorUsuario(codUsuario);
	}
	
	@Override
	public UsuarioRol buscarPorRol(Long idRol) {
		// TODO Auto-generated method stub
		return (UsuarioRol) usuarioRolDao.buscarPorRol(idRol);
	}

	@Override
	public UsuarioRol save(UsuarioRol rol) {
		// TODO Auto-generated method stub
		return usuarioRolDao.save(rol);
	}

	@Override
	public void delete(UsuarioRolKey id) {
		// TODO Auto-generated method stub
		usuarioRolDao.deleteById(id);
	}
	


}
