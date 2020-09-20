package com.informatica.openInfo.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informatica.openInfo.apirest.models.Rol;
import com.informatica.openInfo.apirest.models.Usuario;
import com.informatica.openInfo.apirest.models.UsuarioRol;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;
import com.informatica.openInfo.apirest.services.IRolService;
import com.informatica.openInfo.apirest.services.IUsuarioRolService;
import com.informatica.openInfo.apirest.services.IUsuarioService;

@RestController
@RequestMapping("/admin")
public class UsuariosRolesRestController {
	
	/*
	 * IDP services
	 * 
	 * */
	@Autowired
	private IUsuarioService usuarioService; 
	
	@Autowired
	private IRolService rolService; 
	
	@Autowired
	private IUsuarioRolService usuarioRolService; 
	
	
	/*
	 * SERVICIOS CRUD USUARIOS
	 * 
	 * */
	@GetMapping("/usuarios")
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioService.findAll();
	}

	@GetMapping("/usuarios/{codRegistro}")
	public Usuario findById(@PathVariable String codRegistro) {
		// TODO Auto-generated method stub
		return usuarioService.findById(codRegistro);
	}

	@PostMapping("/usuarios")
	public Usuario save(@RequestBody Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioService.save(usuario);
	}

	@DeleteMapping("/usuarios/{id}")
	public void delete(@PathVariable String id) {
		// TODO Auto-generated method stub
		usuarioService.delete(id);
		
	}
	
	/*
	 * SERVICIOS CRUD ROLES
	 * 
	 * */
	
	@GetMapping("/roles")
	public List<Rol> findAllRol() {
		// TODO Auto-generated method stub
		return (List<Rol>) rolService.findAll();
	}

	@GetMapping("/roles/{id}")
	public Rol findById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return rolService.findById(id);
	}
	
	@PostMapping("/roles")
	public Rol save(@RequestBody Rol rol) {
		// TODO Auto-generated method stub
		return rolService.save(rol);
	}

	@DeleteMapping("/roles/{id}")
	public void delete(@PathVariable Long id) {
		// TODO Auto-generated method stub
		rolService.delete(id);
	}
	
	/*
	 * SERVICIOS USUARIOS-ROLES
	 * 
	 * */

	@GetMapping("/usuariosRoles")
	public List<UsuarioRol> findAllUsuariosRoles() {
		// TODO Auto-generated method stub
		return usuarioRolService.findAll();
	}

	@GetMapping("/usuariosPorUsuario/{codUsuario}")
	public UsuarioRol buscarPorUsuario(@PathVariable String codUsuario) {
		// TODO Auto-generated method stub
		return usuarioRolService.buscarPorUsuario(codUsuario);
	}
	
	@GetMapping("/usuariosporRol/{idRol}")
	public UsuarioRol buscarPorRol(@PathVariable Long idRol) {
		// TODO Auto-generated method stub
		return usuarioRolService.buscarPorRol(idRol);
	}

	@PostMapping("/usuariosRoles")
	public UsuarioRol save(@RequestBody UsuarioRol rol) {
		// TODO Auto-generated method stub
		return usuarioRolService.save(rol);
	}

	@DeleteMapping("/usuariosRoles/{id}")
	public void delete(UsuarioRolKey id) {
		// TODO Auto-generated method stub
		usuarioRolService.delete(id);
	}

}
