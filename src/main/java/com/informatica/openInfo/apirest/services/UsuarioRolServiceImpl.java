package com.informatica.openInfo.apirest.services;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.jaas.AuthorityGranter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.informatica.openInfo.apirest.Dao.IRolDao;
import com.informatica.openInfo.apirest.Dao.IUsuarioRolDao;
import com.informatica.openInfo.apirest.models.Rol;
import com.informatica.openInfo.apirest.models.UsuarioRol;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;


@Service
public class UsuarioRolServiceImpl implements IUsuarioRolService, UserDetailsService{
	
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(UsuarioRolServiceImpl.class);
	@Autowired
	private IUsuarioRolDao usuarioRolDao;
	
	@Autowired
	private IRolDao rolDao;
	

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


	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UsuarioRol usuario = usuarioRolDao.buscarPorUsuario(username);
		if(usuario == null) {
			logger.error("Error de login: No existe el usuario"+username+ " en el sistema");
			throw new UsernameNotFoundException("Error de login: No existe el usuario"+username+ " en el sistema");
		}
		List<Rol> rolesUser= rolDao.rolesDeUsuario(username);
		List<GrantedAuthority> authorities= rolesUser.stream()
				.map(role -> new SimpleGrantedAuthority(role.getTipo()))
				.peek(authority ->   logger.info("Role: "+authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(usuario.getId().getCodRegistro(), usuario.getPassword(), usuario.isHabilitado(), true, true, true, authorities);
	}
	


}
