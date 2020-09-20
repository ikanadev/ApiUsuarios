package com.informatica.openInfo.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatica.openInfo.apirest.Dao.IUsuarioDao;
import com.informatica.openInfo.apirest.models.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	public IUsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public Usuario findById(String codRegistro) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(codRegistro).orElse(null);
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		usuarioDao.deleteById(id);
		
	}

}
